const express = require('express');  // const  常量定义
const bodyParser = require('body-parser');
const session = require('express-session');
const path = require('path');  // 导入path包  类似java  import
const app = express();  // 把函数赋值给app  可以通过app.来调用 express中的函数

const user = require('./route/user');

// 设置了某些信息
app.use(session({
    secret: '123456', 
    cookie: { maxAge: 60 * 1000 * 30 }, 
    resave: false,
    saveUninitialized: true
}));

// 创建 application/x-www-form-urlencoded 编码解析
app.use(bodyParser.urlencoded({ extended: false }));
// 添加静态资源
app.use(express.static(path.join(__dirname, 'css')));
app.use(express.static(path.join(__dirname, 'js')));
app.use(express.static(path.join(__dirname, 'img')));

//登录拦截器
app.use(function(req, res, next) {
    var url = req.originalUrl;
    if (url != "/toLogin" && url != "/" && !req.session.user) {
        return res.redirect("/");
    }
    next();
});
// 在拦截器后添加静态资源
app.use(express.static(path.join(__dirname, 'html')));

app.use('/', user);

app.listen(80);

console.log("successful! http://localhost");