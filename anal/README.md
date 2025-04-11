# RuoYi AI

<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]

<!-- PROJECT LOGO -->
<br />

<img style="text-align: center;" src="image/00.png" alt="Logo" width="150" height="150">

<h3 style="text-align: center;">快速搭建属于自己的 AI 助手平台</h3>

<p style="text-align: center;">
    全新升级，开箱即用，简单高效
    <br />
    <a href="https://doc.pandarobot.chat"><strong>探索本项目的文档 »</strong></a>
    <br />
    <br />
    <a href="https://web.pandarobot.chat">项目预览</a>
    ·
    <a href="https://github.com/ageerle/ruoyi-ai/issues">报告Bug</a>
    ·
    <a href="https://github.com/ageerle/ruoyi-ai/issues">提出新特性</a>
</p>

## 1. 目录

1. [RuoYi AI](#ruoyi-ai)
   1. [1. 目录](#1-目录)
      1. [1.1. 源码地址](#11-源码地址)
      2. [1.2. gitcode 源码地址](#12-gitcode-源码地址)
      3. [1.3. 特色功能](#13-特色功能)
      4. [1.4. 项目演示](#14-项目演示)
         1. [1.4.1. 后台管理](#141-后台管理)
         2. [1.4.2. 用户端](#142-用户端)
         3. [1.4.3. 小程序端](#143-小程序端)
      5. [1.5. 开发前的配置要求](#15-开发前的配置要求)
      6. [1.6. 文件目录说明](#16-文件目录说明)
      7. [1.7. 版本控制](#17-版本控制)
      8. [1.8. 版权说明](#18-版权说明)
      9. [1.9. 项目现状](#19-项目现状)
      10. [1.10. 开发计划](#110-开发计划)
          1. [1.10.1. 如何参与开源项目](#1101-如何参与开源项目)
          2. [1.10.2. 项目文档](#1102-项目文档)
      11. [1.11. 鸣谢](#111-鸣谢)
      12. [1.12. 附：讨论群](#112-附讨论群)

### 1.1. 源码地址

- 项目文档: https://doc.pandarobot.chat
- 前端-后台管理: https://github.com/ageerle/ruoyi-admin
- 前端-用户端: https://github.com/ageerle/ruoyi-web
- 小程序端: https://github.com/ageerle/ruoyi-uniapp
- 演示地址: https://web.pandarobot.chat
- 后台管理: https://admin.pandarobot.chat
- 用户名: admin 密码：admin123

### 1.2. gitcode 源码地址

- https://gitcode.com/ageerle/ruoyi-ai
- https://gitcode.com/ageerle/ruoyi-web
- https://gitcode.com/ageerle/ruoyi-admin
- https://gitcode.com/ageerle/ruoyi-uniapp

### 1.3. 特色功能

1. 全套开源系统：提供完整的前端应用、后台管理以及小程序应用，基于 MIT 协议，开箱即用。
2. 本地 RAG 方案：集成 Milvus/Weaviate 向量库、本地向量化模型与 Ollama，实现本地化 RAG
3. 丰富插件功能：支持联网、SQL 查询插件及 Text2API 插件，扩展系统能力与应用场景。
4. 内置 SSE、websocket 等网络协议，支持对接多种大语言模型，同时还集成了 MidJourney 和 DALLE AI 绘画功能
5. 强大的多媒体功能：支持 AI 翻译、PPT 制作、语音克隆和翻唱等
6. 扩展功能：支持将大模型接入个人或企业微信
7. 支付功能：支持易支付、微信支付等多种支付方式

### 1.4. 项目演示

#### 1.4.1. 后台管理

<div style="display: flex; flex-wrap: wrap; gap: 20px; justify-content: center;">
  <img src="image/02.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
  <img src="image/03.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
  <img src="image/04.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
  <img src="image/05.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
</div>

#### 1.4.2. 用户端

<div style="display: flex; flex-wrap: wrap; gap: 20px; justify-content: center;">
  <img src="image/08.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
  <img src="image/09.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
  <img src="image/10.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
  <img src="image/11.png" alt="drawing" style="width: 600px; height: 300px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
</div>

#### 1.4.3. 小程序端

<div style="display: flex; flex-wrap: wrap; gap: 20px; justify-content: flex-start;">
  <img src="image/06.png" alt="drawing" style="width: 320px; height: 600px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
  <img src="image/07.png" alt="drawing" style="width: 320px; height: 600px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
</div>

### 1.5. 开发前的配置要求

1. jdk 17
2. mysql 5.7、8.0
3. redis 版本必须 >= 5.X
4. maven 3.8+
5. nodejs 20+ & pnpm

### 1.6. 文件目录说明

RuoYi-AI

```
├─ ruoyi-admin                         // 管理模块
│  └─ RuoYiApplication                 // 启动类
│  └─ RuoYiServletInitializer          // 容器部署初始化类
│  └─ resources                        // 资源文件
│      └─ i18n/messages.properties     // 国际化配置文件
│      └─ application.yml              // 框架总配置文件
│      └─ application-dev.yml          // 开发环境配置文件
│      └─ application-prod.yml         // 生产环境配置文件
│      └─ banner.txt                   // 框架启动图标
│      └─ logback-plus.xml             // 日志配置文件
│      └─ ip2region.xdb                // IP区域地址库
├─ ruoyi-common                        // 通用模块
│  └─ ruoyi-common-bom                 // common依赖包管理
   └─ ruoyi-common-chat                // 聊天模块
│  └─ ruoyi-common-core                // 核心模块
│  └─ ruoyi-common-doc                 // 系统接口模块
│  └─ ruoyi-common-encrypt             // 数据加解密模块
│  └─ ruoyi-common-excel               // excel模块
│  └─ ruoyi-common-idempotent          // 幂等功能模块
│  └─ ruoyi-common-json                // 序列化模块
│  └─ ruoyi-common-log                 // 日志模块
│  └─ ruoyi-common-mail                // 邮件模块
│  └─ ruoyi-common-mybatis             // 数据库模块
│  └─ ruoyi-common-oss                 // oss服务模块
│  └─ ruoyi-common-pay                 // 支付模块
│  └─ ruoyi-common-ratelimiter         // 限流功能模块
│  └─ ruoyi-common-redis               // 缓存服务模块
│  └─ ruoyi-common-satoken             // satoken模块
│  └─ ruoyi-common-security            // 安全模块
│  └─ ruoyi-common-sensitive           // 脱敏模块
│  └─ ruoyi-common-sms                 // 短信模块
│  └─ ruoyi-common-tenant              // 租户模块
│  └─ ruoyi-common-translation         // 通用翻译模块
│  └─ ruoyi-common-web                 // web模块
├─ ruoyi-modules                       // 模块组
│  └─ ruoyi-demo                       // 演示模块
│  └─ ruoyi-system                     // 业务模块
├─ .run                 // 执行脚本文件
├─ .editorconfig        // 编辑器编码格式配置
├─ LICENSE              // 开源协议
├─ pom.xml              // 公共依赖
├─ README.md            // 框架说明文件


```

### 1.7. 版本控制

该项目使用 Git 进行版本管理。您可以在 repository 参看当前可用版本。

### 1.8. 版权说明

该项目使用了 MIT 授权许可，详情请参阅 [LICENSE.txt](https://github.com/ageerle/ruoyi-ai/blob/main/LICENSE)

### 1.9. 项目现状

目前，项目还处于早期阶段，距离成熟还有很长的路要走。由于个人精力有限，项目的发展速度受到了一定的限制。为了加快项目的进度，我真诚地希望更多人能够参与到项目中来。无论是经验丰富的开发者，还是刚刚入门的小白，我都热烈欢迎你们提交 Pull Request（PR）。即使代码修改得很少，或者存在一些错误，都没有关系。我会认真审核每一位贡献者的代码，并和大家一起完善项目。

### 1.10. 开发计划

- 智能体管理

通过设置提示词、插件、知识库等，用户可以快速构建一个 AI 应用。这将极大地简化 AI 应用的开发流程，降低开发门槛，使更多企业能够轻松地利用 AI 技术。

<div>
  <img src="image/13.png" alt="drawing" width="600px" height="300px"/>
</div>

- 流程编排

通过流程编排功能，用户可以将不同的模型按照业务逻辑进行有序连接。这将解决单一模型能力不足的问题，充分发挥多个模型的协同作用，从而更好地满足企业的复杂业务需求。

- 感谢

最后，我要感谢 RuoYi-Vue-Plus、chatgpt-java、chatgpt-web-midjourney-proxy 等优秀框架。正是因为这些项目的开源和共享，我才能够在这个基础上进行开发，使我们的项目能够取得今天的成果。再次感谢这些项目及其背后的开发者们！

希望更多志同道合的朋友能够加入我们，共同推动这个项目的发展。让我们一起努力，将这个项目打造成一个真正成熟、实用的 AI 平台！

#### 1.10.1. 如何参与开源项目

贡献使开源社区成为一个学习、激励和创造的绝佳场所。你所作的任何贡献都是**非常感谢**的。

1. Fork 这个项目
2. 创建你的功能分支 (`git checkout -b feature/dev`)
3. 提交你的更改 (`git commit -m 'Add some dev'`)
4. 推送到分支 (`git push origin feature/dev`)
5. 打开拉取请求
6. pr 请提交到 GitHub 上，会定时同步到 gitee

#### 1.10.2. 项目文档

1. 项目文档基于 vitepress 构建
2. 按照[如何参与开源项目](#如何参与开源项目)拉取 https://github.com/ageerle/ruoyi-doc
3. 安装依赖：npm install
4. 启动项目：npm run docs:dev
5. 主页路径：docs/guide/introduction/index.md

### 1.11. 鸣谢

- [chatgpt-java](https://github.com/Grt1228/chatgpt-java)
- [RuoYi-Vue-Plus](https://gitee.com/dromara/RuoYi-Vue-Plus)
- [chatgpt-web-midjourney-proxy](https://github.com/Dooy/chatgpt-web-midjourney-proxy)
- [Vben Admin](https://github.com/vbenjs/vue-vben-admin)
- [Naive UI](https://www.naiveui.com)

<!-- links -->

[your-project-path]: https://github.com/ageerle/ruoyi-ai
[contributors-shield]: https://img.shields.io/github/contributors/ageerle/ruoyi-ai.svg?style=flat-square
[contributors-url]: https://github.com/ageerle/ruoyi-ai/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/ageerle/ruoyi-ai.svg?style=flat-square
[forks-url]: https://github.com/ageerle/ruoyi-ai/network/members
[stars-shield]: https://img.shields.io/github/stars/ageerle/ruoyi-ai.svg?style=flat-square
[stars-url]: https://github.com/ageerle/ruoyi-ai/stargazers
[issues-shield]: https://img.shields.io/github/issues/ageerle/ruoyi-ai.svg?style=flat-square
[issues-url]: https://img.shields.io/github/issues/ageerle/ruoyi-ai.svg
[license-shield]: https://img.shields.io/github/license/ageerle/ruoyi-ai.svg?style=flat-square
[license-url]: https://github.com/ageerle/ruoyi-ai/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555

### 1.12. 附：讨论群

    🏠 wx：ruoyi-ai（加人备注：ruoyi-ai）

    🏠 qq：1603234088 （加人备注：ruoyi-ai）

        👏👏👏 ruoyi-ai官方交流1群（qq区）：1034554687

<div style="display: flex; flex-wrap: wrap; gap: 20px; justify-content: center;">
  <img src="image/QQ区-官方交流1群.png" alt="drawing" style="width: 400px; height: 400px; border: 2px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1);"/>
</div>
