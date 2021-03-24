package com.example.springcloud;

public class Test {
    public static void main(String[] args) {
        String a = "{\n" +
                "    \"success\": true,\n" +
                "    \"msg\": \"\",\n" +
                "    \"obj\": {\n" +
                "        \"permission\": {\n" +
                "            \"website\": [\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2017-11-30T00:45:04.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 53,\n" +
                "                    \"name\": \"root\",\n" +
                "                    \"shirourl\": \"/website\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"website\",\n" +
                "                    \"pkey\": \"站点\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-19T23:54:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 240,\n" +
                "                    \"name\": \"部门账号管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=oauth/user/apporganizationtree\",\n" +
                "                    \"url\": \"/v.do?u=oauth/user/apporganizationtree\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"30c7e9c4e4984653b5d54077af76341b\",\n" +
                "                    \"pkey\": \"37ccab94254e41dfa6a9baf10d040dbe\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-pencil\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-19T23:57:09.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 242,\n" +
                "                    \"name\": \"添加用户\",\n" +
                "                    \"shirourl\": \"/oauth/user/appuser/add\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"7cb22da8add24ba9b598ddc089900df0\",\n" +
                "                    \"pkey\": \"30c7e9c4e4984653b5d54077af76341b\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:01:26.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 248,\n" +
                "                    \"name\": \"查看\",\n" +
                "                    \"shirourl\": \"/oauth/user/approle/see\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"c060d88f405d4b9cb43d7db91cb8ec43\",\n" +
                "                    \"pkey\": \"ec7e2c283024494a880e709966a77a35\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-07T18:41:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 341,\n" +
                "                    \"name\": \"附加信息配置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/extraParamConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/extraParamConfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"50546b5d404e4e00b46ea57f23714eda\",\n" +
                "                    \"pkey\": \"05fa9aa76f3b46aebc59eaf394641981\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-paperclip\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:06:26.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 552,\n" +
                "                    \"name\": \"单币种实时价格\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/web/appconfig/page/realtimepriceconfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"ac3bf2a63c444093a4878308e4363131\",\n" +
                "                    \"pkey\": \"2c9f2f16b6f94dfd9e6a67004ad6655a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-eur\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:06:52.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 553,\n" +
                "                    \"name\": \"交易对实时价格\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/klinedataconfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/klinedataconfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"29d37e957d0d4237bf289a3477059401\",\n" +
                "                    \"pkey\": \"2c9f2f16b6f94dfd9e6a67004ad6655a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-resize-small\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:07:26.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 554,\n" +
                "                    \"name\": \"多币种实时价格\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/web/appconfig/page/realTimePairPriceConfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"79778274a5844e64a1b8f04d1febf81d\",\n" +
                "                    \"pkey\": \"2c9f2f16b6f94dfd9e6a67004ad6655a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-btc\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:16:09.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 557,\n" +
                "                    \"name\": \"币种资料管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exproductlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exproductlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"05513fcbfb4743b281857dd0fe6a30b3\",\n" +
                "                    \"pkey\": \"75cd90dfbbbe4fb0a1b2b807ab909c76\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-book\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:20:12.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 561,\n" +
                "                    \"name\": \"添加\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exproduct/add\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"537ab5c6b0454171ad5d79a44ddac3e3\",\n" +
                "                    \"pkey\": \"05513fcbfb4743b281857dd0fe6a30b3\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-plus\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:21:03.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 562,\n" +
                "                    \"name\": \"修改\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exproduct/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"5eab91736c924bdebb2667ee1be8f67d\",\n" +
                "                    \"pkey\": \"05513fcbfb4743b281857dd0fe6a30b3\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-pencil\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:21:16.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 563,\n" +
                "                    \"name\": \"发布\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exproduct/publish\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"5d3e87c5cc8245719d2f9a80824d169c\",\n" +
                "                    \"pkey\": \"05513fcbfb4743b281857dd0fe6a30b3\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-ok\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:43:09.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 565,\n" +
                "                    \"name\": \"修改\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exproductparameter/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"e37cb7ec1a164e7493369dd359c1bf45\",\n" +
                "                    \"pkey\": \"f1adb8324f9e485e93b1649dad1a242f\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-pencil\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T22:52:47.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 566,\n" +
                "                    \"name\": \"系统服务监控\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appservermonitorlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appservermonitorlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"3865ea5126dc46a9a9f509aa16266f58\",\n" +
                "                    \"pkey\": \"6a19d9262eee403ca2f7b1b4f4d8c0d2\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-19T23:00:04.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 580,\n" +
                "                    \"name\": \"短信接口配置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/smsConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/smsConfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"533efe80e04c48a1a8432de1f45e3107\",\n" +
                "                    \"pkey\": \"73f91d79e5c24486afa6d295434e8a37\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-comment\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-30T22:24:26.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 588,\n" +
                "                    \"name\": \"前端行为日志\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/logcommonaopfrontlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/logcommonaopfrontlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"45218adf71bb4e21837891464194619a\",\n" +
                "                    \"pkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-01-14T22:47:49.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 627,\n" +
                "                    \"name\": \"APP安装包管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appfileuploadlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appfileuploadlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"7a3efcc1be034d7dbb2cb4d9f48165c5\",\n" +
                "                    \"pkey\": \"0e8443037b3b4256b7d327eab283788e\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-briefcase\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T19:31:47.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 84,\n" +
                "                    \"name\": \"用户登录日志\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/loginaoplist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/loginaoplist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"18349ff508a044cbb4f8bb184ecb475a\",\n" +
                "                    \"pkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-user\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-19T23:53:33.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 239,\n" +
                "                    \"name\": \"后台账号管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"37ccab94254e41dfa6a9baf10d040dbe\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-user\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-19T23:55:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 241,\n" +
                "                    \"name\": \"角色权限管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=oauth/user/approlelist\",\n" +
                "                    \"url\": \"/v.do?u=oauth/user/approlelist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"ec7e2c283024494a880e709966a77a35\",\n" +
                "                    \"pkey\": \"37ccab94254e41dfa6a9baf10d040dbe\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-paperclip\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-19T23:57:27.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 243,\n" +
                "                    \"name\": \"编辑用户\",\n" +
                "                    \"shirourl\": \"/oauth/user/appuser/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"669b24b738984885969eab9ce35bc256\",\n" +
                "                    \"pkey\": \"30c7e9c4e4984653b5d54077af76341b\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-19T23:57:47.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 244,\n" +
                "                    \"name\": \"查看用户\",\n" +
                "                    \"shirourl\": \"/oauth/user/appuser/see\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"6ae1df7e1f6b4442ae08a09fb2345d42\",\n" +
                "                    \"pkey\": \"30c7e9c4e4984653b5d54077af76341b\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:01:55.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 249,\n" +
                "                    \"name\": \"编辑\",\n" +
                "                    \"shirourl\": \"/oauth/user/approle/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"ce76a13c9ad740a6b4c6b3e97bad621f\",\n" +
                "                    \"pkey\": \"ec7e2c283024494a880e709966a77a35\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-22T23:20:28.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 321,\n" +
                "                    \"name\": \"后端行为日志\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/logcommonaopbacklist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/logcommonaopbacklist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"ffd6caec806741b4a488413f2f0a15b5\",\n" +
                "                    \"pkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-ice-lolly\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T22:53:17.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 567,\n" +
                "                    \"name\": \"K线机器人监控\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exrobotmonitorlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotmonitorlist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"90473a09ce224feb97e0d0bc5cb7ada1\",\n" +
                "                    \"pkey\": \"6a19d9262eee403ca2f7b1b4f4d8c0d2\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-19T22:58:45.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 579,\n" +
                "                    \"name\": \"实名认证配置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/juheConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/juheConfig\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"b16793efb437436794afc9996c7e72b2\",\n" +
                "                    \"pkey\": \"73f91d79e5c24486afa6d295434e8a37\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-eye-open\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-27T02:51:38.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 587,\n" +
                "                    \"name\": \"币种回收站\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exproductcallback\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exproductcallback\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"1b6449488240456da622d3b8ba8c3803\",\n" +
                "                    \"pkey\": \"75cd90dfbbbe4fb0a1b2b807ab909c76\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-01-14T22:48:27.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 628,\n" +
                "                    \"name\": \"APP二维码管理\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/appQRCodeConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/appQRCodeConfig\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"c4d9f98abc8143d390b1672104ebdfbf\",\n" +
                "                    \"pkey\": \"0e8443037b3b4256b7d327eab283788e\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-qrcode\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T19:32:01.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 85,\n" +
                "                    \"name\": \"后台登录日志\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/apploginloglist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/apploginloglist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"cbe393b69121490987ec1e95761cf034\",\n" +
                "                    \"pkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-hdd\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:02:15.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 250,\n" +
                "                    \"name\": \"添加\",\n" +
                "                    \"shirourl\": \"/oauth/user/approle/add\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"65bfa3f4eb7b4896a915bbf2bc396c67\",\n" +
                "                    \"pkey\": \"ec7e2c283024494a880e709966a77a35\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:13:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 556,\n" +
                "                    \"name\": \"币种上架管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"75cd90dfbbbe4fb0a1b2b807ab909c76\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-btc\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:17:07.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 558,\n" +
                "                    \"name\": \"币种参数配置\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exproductparameterlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exproductparameterlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"f1adb8324f9e485e93b1649dad1a242f\",\n" +
                "                    \"pkey\": \"75cd90dfbbbe4fb0a1b2b807ab909c76\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tag\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T22:53:53.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 568,\n" +
                "                    \"name\": \"深度机器人监控\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exrobotdeepmonitorlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotdeepmonitorlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"53a3de2e628f4f8c9f9ffd85cf9fe079\",\n" +
                "                    \"pkey\": \"6a19d9262eee403ca2f7b1b4f4d8c0d2\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T19:29:15.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 78,\n" +
                "                    \"name\": \"数据字典管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/dic/appdictree\",\n" +
                "                    \"url\": \"/v.do?u=admin/dic/appdictree\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"44ac6b2647a14d1ca0bfc2e846486f95\",\n" +
                "                    \"pkey\": \"73f91d79e5c24486afa6d295434e8a37\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:00:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 245,\n" +
                "                    \"name\": \"删除用户\",\n" +
                "                    \"shirourl\": \"/oauth/user/appuser/remove\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"60024af4559e4a89b62fff2a1997c563\",\n" +
                "                    \"pkey\": \"30c7e9c4e4984653b5d54077af76341b\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:02:36.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 251,\n" +
                "                    \"name\": \"删除\",\n" +
                "                    \"shirourl\": \"/oauth/user/approle/remove\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"9ca0e2c6a5f04ac2a787eeaa5a23797a\",\n" +
                "                    \"pkey\": \"ec7e2c283024494a880e709966a77a35\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-07T18:42:52.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 343,\n" +
                "                    \"name\": \"友情链接管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appfriendlinklist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appfriendlinklist\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"76ec9d04746d486b853d7be923b2dfb9\",\n" +
                "                    \"pkey\": \"05fa9aa76f3b46aebc59eaf394641981\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-heart\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:18:39.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 560,\n" +
                "                    \"name\": \"ERC20自助上架\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exerc20list\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exerc20list\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"9c6738b7d9a346a68ede4cf2057c2fb6\",\n" +
                "                    \"pkey\": \"75cd90dfbbbe4fb0a1b2b807ab909c76\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-bookmark\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-01-14T22:44:40.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 626,\n" +
                "                    \"name\": \"APP版本管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"0e8443037b3b4256b7d327eab283788e\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-phone\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-16T15:55:12.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 230,\n" +
                "                    \"name\": \"客服配置管理\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/interfaceConfigCS\",\n" +
                "                    \"url\": \"/web/appconfig/page/interfaceConfigCS\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"d0c638ef90cc4b7babbcc2a068c05899\",\n" +
                "                    \"pkey\": \"73f91d79e5c24486afa6d295434e8a37\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-phone-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:00:45.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 246,\n" +
                "                    \"name\": \"重置密码\",\n" +
                "                    \"shirourl\": \"/oauth/user/appuser/resetpw\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"1caee28a0fbc4d3a82bd565bb9592f45\",\n" +
                "                    \"pkey\": \"30c7e9c4e4984653b5d54077af76341b\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-07T18:39:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 340,\n" +
                "                    \"name\": \"站点信息管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"05fa9aa76f3b46aebc59eaf394641981\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:01:07.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 247,\n" +
                "                    \"name\": \"部门调动\",\n" +
                "                    \"shirourl\": \"/oauth/user/appuser/modifyOrganization\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"ef7c03e8e8954e9a8ac64ce25b883555\",\n" +
                "                    \"pkey\": \"30c7e9c4e4984653b5d54077af76341b\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:05:54.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 551,\n" +
                "                    \"name\": \"行情接口管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"2c9f2f16b6f94dfd9e6a67004ad6655a\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-stats\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T19:28:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 75,\n" +
                "                    \"name\": \"系统配置管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"73f91d79e5c24486afa6d295434e8a37\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-wrench\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-18T21:24:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 564,\n" +
                "                    \"name\": \"系统运行监控\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"6a19d9262eee403ca2f7b1b4f4d8c0d2\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-eye-open\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T19:30:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 81,\n" +
                "                    \"name\": \"系统日志管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"pkey\": \"website\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-file\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-25T20:53:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 585,\n" +
                "                    \"name\": \"front报错日志\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appfrontgloballoglist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appfrontgloballoglist\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"ca75ce569ff847bdabc5a73dc1284e83\",\n" +
                "                    \"pkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-25T20:54:07.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 586,\n" +
                "                    \"name\": \"service错误日志\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appservicegloballoglist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appservicegloballoglist\",\n" +
                "                    \"orderno\": 9,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"9d3ea76cb86549138d24f9564b8344cb\",\n" +
                "                    \"pkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-21T00:39:10.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 581,\n" +
                "                    \"name\": \"admin报错日志\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appgloballoglist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appgloballoglist\",\n" +
                "                    \"orderno\": 10,\n" +
                "                    \"appname\": \"website\",\n" +
                "                    \"mkey\": \"2a571cd9d8744b188cced9d8878efb16\",\n" +
                "                    \"pkey\": \"2a657d5ad9a64aab8d4eb674c377b95a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"dividendMin\": [\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-07T11:03:48.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 383,\n" +
                "                    \"name\": \"root\",\n" +
                "                    \"shirourl\": \"/dividendMin\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"dividendMin\",\n" +
                "                    \"pkey\": \"平台币\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:16:54.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 423,\n" +
                "                    \"name\": \"收入信息详情\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/mining/exmininginfoIncomelist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/mining/exmininginfoIncomelist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"86192d40798041b4b2c218ccdca8d51c\",\n" +
                "                    \"pkey\": \"ca39359705ac4cf39f57e6ae76a1a75b\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-align-justify\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:18:01.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 426,\n" +
                "                    \"name\": \"挖矿返还记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/mining/exmininginfolist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/mining/exmininginfolist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"7226ff9135c445f5bcceab36d387def3\",\n" +
                "                    \"pkey\": \"a194ab4fddf3435897e71df518300e03\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:49:19.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 455,\n" +
                "                    \"name\": \"挖矿分红配置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/platformCoinConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/platformCoinConfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"558f35cae85d40468dc5d2d8721a2df6\",\n" +
                "                    \"pkey\": \"5c589f2f85904e7493489095396f232d\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-info-sign\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-14T23:36:27.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 541,\n" +
                "                    \"name\": \"平台币参数配置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/basefinanceConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/basefinanceConfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"a9f728891e9b4627b049c785e6fbf801\",\n" +
                "                    \"pkey\": \"dividendMin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-road\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:17:14.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 424,\n" +
                "                    \"name\": \"待发放分红明细\",\n" +
                "                    \"shirourl\": \"/mining/exminingbonus/toExminingbonusList?status=0\",\n" +
                "                    \"url\": \"/mining/exminingbonus/toExminingbonusList?status=0\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"06c9690928c74a6ba92af0c672c20053\",\n" +
                "                    \"pkey\": \"ca39359705ac4cf39f57e6ae76a1a75b\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:18:19.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 427,\n" +
                "                    \"name\": \"产出待发放明细\",\n" +
                "                    \"shirourl\": \"/mining/exmining/toEminingList?status=0\",\n" +
                "                    \"url\": \"/mining/exmining/toEminingList?status=0\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"ff80b87a35ab458ebf52e1141fe173a9\",\n" +
                "                    \"pkey\": \"a194ab4fddf3435897e71df518300e03\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tasks\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:19:41.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 430,\n" +
                "                    \"name\": \"用户锁仓记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/lock/exdmlockrecordlist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/lock/exdmlockrecordlist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"17e6891c53e744cfbe4e1691c8773b3e\",\n" +
                "                    \"pkey\": \"38b48103331d4ddc911765c4a5fd32b9\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:49:38.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 456,\n" +
                "                    \"name\": \"定时器配置\",\n" +
                "                    \"shirourl\": \"/mining/exmining/toTimer\",\n" +
                "                    \"url\": \"/mining/exmining/toTimer\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"6fb1905dfc24453a807e9ff975ce6369\",\n" +
                "                    \"pkey\": \"5c589f2f85904e7493489095396f232d\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-time\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T23:47:11.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 520,\n" +
                "                    \"name\": \"锁仓规则配置\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/lock/exdmlocklist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/lock/exdmlocklist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"4a8f0897638748c9a0e82ec5889d4ad4\",\n" +
                "                    \"pkey\": \"5c589f2f85904e7493489095396f232d\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-lock\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-25T19:33:40.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 584,\n" +
                "                    \"name\": \"基础参数配置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/basefinanceConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/basefinanceConfig\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"cbf8a9d350b84b41bfac7cee4dd2c131\",\n" +
                "                    \"pkey\": \"a9f728891e9b4627b049c785e6fbf801\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:19:41.000+0000\",\n" +
                "                    \"modified\": \"2019-03-28T22:08:01.000+0000\",\n" +
                "                    \"id\": 795,\n" +
                "                    \"name\": \"用户等级配置\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/partner/partnerconfiglist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/partner/partnerconfiglist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"17e6891c53e744cfbe4e1eshjhdh123\",\n" +
                "                    \"pkey\": \"38b48103331d4deo12365c4a5fd32q9\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:19:41.000+0000\",\n" +
                "                    \"modified\": \"2019-03-28T22:08:01.000+0000\",\n" +
                "                    \"id\": 796,\n" +
                "                    \"name\": \"存储奖励记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/partner/partnertransactionlist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/partner/partnertransactionlist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"839oojhsa4o744cfbe4e1eshjhdh123\",\n" +
                "                    \"pkey\": \"38b48103331d4deo12365c4a5fd32q9\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:19:41.000+0000\",\n" +
                "                    \"modified\": \"2019-03-28T22:08:01.000+0000\",\n" +
                "                    \"id\": 797,\n" +
                "                    \"name\": \"用户释放记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/partner/partnertransactionIssuelist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/partner/partnertransactionIssuelist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"839oklfhduwhds778jhn001j11qdh123\",\n" +
                "                    \"pkey\": \"38b48103331d4deo12365c4a5fd32q9\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:19:41.000+0000\",\n" +
                "                    \"modified\": \"2019-03-28T22:08:01.000+0000\",\n" +
                "                    \"id\": 798,\n" +
                "                    \"name\": \"用户待释放账户\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/partner/partneraccountlist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/partner/partneraccountlist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"839oklSwgUYI3uMBeOyMrH11j11qdh123\",\n" +
                "                    \"pkey\": \"38b48103331d4deo12365c4a5fd32q9\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:19:41.000+0000\",\n" +
                "                    \"modified\": \"2019-03-28T22:08:01.000+0000\",\n" +
                "                    \"id\": 799,\n" +
                "                    \"name\": \"普通用户设置\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/partner/partnerconfiggeneral\",\n" +
                "                    \"url\": \"/v.do?u=/admin/partner/partnerconfiggeneral\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"839oklSuMBeOyMrsDEQsQU8JYClOSzz\",\n" +
                "                    \"pkey\": \"38b48103331d4deo12365c4a5fd32q9\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:17:36.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 425,\n" +
                "                    \"name\": \"已发放分红明细\",\n" +
                "                    \"shirourl\": \"/mining/exminingbonus/toExminingbonusList?status=1\",\n" +
                "                    \"url\": \"/mining/exminingbonus/toExminingbonusList?status=1\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"69e5081f9f53404eaa91e863524848f4\",\n" +
                "                    \"pkey\": \"ca39359705ac4cf39f57e6ae76a1a75b\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-pencil\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:18:36.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 428,\n" +
                "                    \"name\": \"产出已发放明细\",\n" +
                "                    \"shirourl\": \"/mining/exmining/toEminingList?status=1\",\n" +
                "                    \"url\": \"/mining/exmining/toEminingList?status=1\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"fb7752cb5f584319b2c30cc962c4619e\",\n" +
                "                    \"pkey\": \"a194ab4fddf3435897e71df518300e03\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-edit\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:20:07.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 431,\n" +
                "                    \"name\": \"用户解锁记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/lock/exdmunlockrecordlist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/lock/exdmunlockrecordlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"fe1f7583dc964d64b6fc8c176604afce\",\n" +
                "                    \"pkey\": \"38b48103331d4ddc911765c4a5fd32b9\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-hand-up\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:48:48.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 454,\n" +
                "                    \"name\": \"业务规则配置\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"5c589f2f85904e7493489095396f232d\",\n" +
                "                    \"pkey\": \"dividendMin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:06:44.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 384,\n" +
                "                    \"name\": \"挖矿产出管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"a194ab4fddf3435897e71df518300e03\",\n" +
                "                    \"pkey\": \"dividendMin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-euro\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:07:29.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 385,\n" +
                "                    \"name\": \"分红收入管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"ca39359705ac4cf39f57e6ae76a1a75b\",\n" +
                "                    \"pkey\": \"dividendMin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-log-in\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:08:29.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 386,\n" +
                "                    \"name\": \"解仓锁仓管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"38b48103331d4ddc911765c4a5fd32b9\",\n" +
                "                    \"pkey\": \"dividendMin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-lock\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:08:29.000+0000\",\n" +
                "                    \"modified\": \"2019-03-28T22:08:01.000+0000\",\n" +
                "                    \"id\": 794,\n" +
                "                    \"name\": \"合伙人管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 9,\n" +
                "                    \"appname\": \"dividendMin\",\n" +
                "                    \"mkey\": \"38b48103331d4deo12365c4a5fd32q9\",\n" +
                "                    \"pkey\": \"dividendMin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-lock\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"c2ctrade\": [\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-07T11:03:48.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 382,\n" +
                "                    \"name\": \"root\",\n" +
                "                    \"shirourl\": \"/c2ctrade\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"c2ctrade\",\n" +
                "                    \"pkey\": \"C2C\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:17:18.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 387,\n" +
                "                    \"name\": \"交易商户管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"22f5566613364b5ea17e9dc8d2f1281a\",\n" +
                "                    \"pkey\": \"c2ctrade\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-user\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:27:12.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 392,\n" +
                "                    \"name\": \"交易币种管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/c2c/c2ccoinlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/c2c/c2ccoinlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"502fb59fe4be488c811ffabf077ce126\",\n" +
                "                    \"pkey\": \"e4251391a0cf499fa6ecba254da14b07\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-bitcoin\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:27:31.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 393,\n" +
                "                    \"name\": \"添加\",\n" +
                "                    \"shirourl\": \"/admin/c2c/c2ccoin/add\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"b55960fccb53429681ada72f1c1f83fc\",\n" +
                "                    \"pkey\": \"502fb59fe4be488c811ffabf077ce126\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:31:41.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 397,\n" +
                "                    \"name\": \"未到账交易订单\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/c2c/c2ctransactionlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/c2c/c2ctransactionlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"b5e1c168e78646beae574c15c53735fb\",\n" +
                "                    \"pkey\": \"5d3e44bfdb914abe828dde1e7b1c8c97\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-magnet\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:31:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 398,\n" +
                "                    \"name\": \"确认到账\",\n" +
                "                    \"shirourl\": \"/admin/c2c/c2ctransaction/confirm\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"83ae501e60c246958af5283c920948fe\",\n" +
                "                    \"pkey\": \"b5e1c168e78646beae574c15c53735fb\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:36:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 404,\n" +
                "                    \"name\": \"交易商户管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/c2c/appbusinessmanlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/c2c/appbusinessmanlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"54583e977be94ae7ac7700dca7a3ba75\",\n" +
                "                    \"pkey\": \"22f5566613364b5ea17e9dc8d2f1281a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-user\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:36:46.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 405,\n" +
                "                    \"name\": \"添加\",\n" +
                "                    \"shirourl\": \"/admin/c2c/appbusinessman/add\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"87028af9689a4f8290af464d96c2124c\",\n" +
                "                    \"pkey\": \"54583e977be94ae7ac7700dca7a3ba75\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:38:25.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 409,\n" +
                "                    \"name\": \"添加\",\n" +
                "                    \"shirourl\": \"/admin/c2c/appbusinessmanbank/add\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"b2967d957b1d43efaaff87836b07456b\",\n" +
                "                    \"pkey\": \"7ab157a385184e8980b86d543c23c3e7\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:19:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 389,\n" +
                "                    \"name\": \"C2C规则管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"e4251391a0cf499fa6ecba254da14b07\",\n" +
                "                    \"pkey\": \"c2ctrade\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:27:50.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 394,\n" +
                "                    \"name\": \"编辑\",\n" +
                "                    \"shirourl\": \"/admin/c2c/c2ccoin/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"e24fd7d56bfd43b8afd4512e87105490\",\n" +
                "                    \"pkey\": \"502fb59fe4be488c811ffabf077ce126\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:28:15.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 395,\n" +
                "                    \"name\": \"匹配规则设置\",\n" +
                "                    \"shirourl\": \"/c2c/c2cconfig/rulepage\",\n" +
                "                    \"url\": \"/c2c/c2cconfig/rulepage\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"edba6fcb110a449286bb6970d5dd82e6\",\n" +
                "                    \"pkey\": \"e4251391a0cf499fa6ecba254da14b07\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:32:14.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 399,\n" +
                "                    \"name\": \"关闭交易\",\n" +
                "                    \"shirourl\": \"/admin/c2c/c2ctransaction/close\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"d94fdf8676ec4388ab812c62955dde11\",\n" +
                "                    \"pkey\": \"b5e1c168e78646beae574c15c53735fb\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:32:58.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 401,\n" +
                "                    \"name\": \"全部订单查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/c2c/c2ctransactionlistall\",\n" +
                "                    \"url\": \"/v.do?u=admin/c2c/c2ctransactionlistall\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"ac5c687233f14fccb9a3f822aa5708e9\",\n" +
                "                    \"pkey\": \"5d3e44bfdb914abe828dde1e7b1c8c97\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:37:04.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 406,\n" +
                "                    \"name\": \"编辑\",\n" +
                "                    \"shirourl\": \"/admin/c2c/appbusinessman/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"9ab3b3e58341413abc6baa2bafe8cf31\",\n" +
                "                    \"pkey\": \"54583e977be94ae7ac7700dca7a3ba75\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:37:57.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 408,\n" +
                "                    \"name\": \"银行卡片管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/c2c/appbusinessmanbanklist\",\n" +
                "                    \"url\": \"/v.do?u=admin/c2c/appbusinessmanbanklist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"7ab157a385184e8980b86d543c23c3e7\",\n" +
                "                    \"pkey\": \"22f5566613364b5ea17e9dc8d2f1281a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-credit-card\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:38:46.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 410,\n" +
                "                    \"name\": \"编辑\",\n" +
                "                    \"shirourl\": \"/admin/c2c/appbusinessmanbank/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"2bd25de5f37e4ef39dfac27f7ad74713\",\n" +
                "                    \"pkey\": \"7ab157a385184e8980b86d543c23c3e7\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:17:58.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 388,\n" +
                "                    \"name\": \"C2C订单管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"5d3e44bfdb914abe828dde1e7b1c8c97\",\n" +
                "                    \"pkey\": \"c2ctrade\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-file\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:29:03.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 396,\n" +
                "                    \"name\": \"订单超时设置\",\n" +
                "                    \"shirourl\": \"/c2c/c2cconfig/timeoutpage\",\n" +
                "                    \"url\": \"/c2c/c2cconfig/timeoutpage\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"a9a87bef76614f13b166effbee741724\",\n" +
                "                    \"pkey\": \"e4251391a0cf499fa6ecba254da14b07\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-dashboard\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:32:37.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 400,\n" +
                "                    \"name\": \"查看订单\",\n" +
                "                    \"shirourl\": \"/admin/c2c/c2ctransaction/see\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"1b039279bc8f4a059fb4334d70ba7332\",\n" +
                "                    \"pkey\": \"b5e1c168e78646beae574c15c53735fb\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:33:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 402,\n" +
                "                    \"name\": \"已取消订单查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/c2c/c2ctransactionlistclose\",\n" +
                "                    \"url\": \"/v.do?u=admin/c2c/c2ctransactionlistclose\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"4b807545922c4e26b7414334e170920c\",\n" +
                "                    \"pkey\": \"5d3e44bfdb914abe828dde1e7b1c8c97\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-warning-sign\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:37:27.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 407,\n" +
                "                    \"name\": \"删除\",\n" +
                "                    \"shirourl\": \"/admin/c2c/appbusinessman/delete\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"4490e0498e624d1a843373b6afc81105\",\n" +
                "                    \"pkey\": \"54583e977be94ae7ac7700dca7a3ba75\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:39:03.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 411,\n" +
                "                    \"name\": \"删除\",\n" +
                "                    \"shirourl\": \"/admin/c2c/appbusinessmanbank/delete\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"02a324aac83244edb6d300bcd42bcdbe\",\n" +
                "                    \"pkey\": \"7ab157a385184e8980b86d543c23c3e7\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:35:21.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 403,\n" +
                "                    \"name\": \"已完成订单查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/c2c/c2ctransactionlistconfirm\",\n" +
                "                    \"url\": \"/v.do?u=admin/c2c/c2ctransactionlistconfirm\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"c2ctrade\",\n" +
                "                    \"mkey\": \"93de59c6ca88442fb382e3d53d3c927c\",\n" +
                "                    \"pkey\": \"5d3e44bfdb914abe828dde1e7b1c8c97\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-heart-empty\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"admin\": [\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2017-11-30T00:45:04.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 3,\n" +
                "                    \"name\": \"root\",\n" +
                "                    \"shirourl\": \"/admin\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"admin\",\n" +
                "                    \"pkey\": \"客服\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T18:50:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 47,\n" +
                "                    \"name\": \"成功充币查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exdmtransactionlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exdmtransactionlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"9e655eb94e6d4a06a714903f0a7a66ae\",\n" +
                "                    \"pkey\": \"3bd75909717a4b108fa3f38be6205d38\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T18:51:03.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 48,\n" +
                "                    \"name\": \"提币申请审核\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exdmtransactionWapplyList\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exdmtransactionWapplyList\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"27b48b14a82f4a47a82f31b3bb319fd2\",\n" +
                "                    \"pkey\": \"3bd75909717a4b108fa3f38be6205d38\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-eye-open\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T18:51:13.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 49,\n" +
                "                    \"name\": \"成功提币查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exdmtransactionWsuccessList\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exdmtransactionWsuccessList\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"ed600355cdcc4881bf5e66e7d54362c4\",\n" +
                "                    \"pkey\": \"3bd75909717a4b108fa3f38be6205d38\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T18:51:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 50,\n" +
                "                    \"name\": \"失败提币查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exdmtransactionWfailList\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exdmtransactionWfailList\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"075fe44f687949e481f58d1918e27759\",\n" +
                "                    \"pkey\": \"3bd75909717a4b108fa3f38be6205d38\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-10T19:18:54.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 293,\n" +
                "                    \"name\": \"我方账户管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appouraccountlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appouraccountlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"11f33273283043cb93e49477831262d9\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-blackboard\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:29:39.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 474,\n" +
                "                    \"name\": \"未实名用户管理\",\n" +
                "                    \"shirourl\": \"/customer/appcustomer/toCustomer.do?isReal=0\",\n" +
                "                    \"url\": \"/customer/appcustomer/toCustomer.do?isReal=0\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star-empty\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:33:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 483,\n" +
                "                    \"name\": \"推荐用户业绩\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/commend/appcommenduserlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/commend/appcommenduserlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"1dcbe0c0b40440dabd78fa84164e40a1\",\n" +
                "                    \"pkey\": \"68a81358219c421e993549bebc652977\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-file\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:34:48.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 487,\n" +
                "                    \"name\": \"手动充币\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exdigitalmoneyaccount/recharge111\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"826ebd247df548eeafd00d39ca9dc71e\",\n" +
                "                    \"pkey\": \"3d71780e2e814fe4af5609473282e066\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:36:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 491,\n" +
                "                    \"name\": \"重置安全策略\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/resetSecurity\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"ee90f04ad9fa49f692d960c49ab01745\",\n" +
                "                    \"pkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:39:18.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 498,\n" +
                "                    \"name\": \"邮件激活\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/active\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"d2a79161bdca4ba5966d3b8a0b237837\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:45:03.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 509,\n" +
                "                    \"name\": \"撰写站内信\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appmessageadd\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appmessageadd\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"61587933240d4d8bad2e7c12390cf3a5\",\n" +
                "                    \"pkey\": \"d6b8e0b5d8d94091879c3d0f45c0f08a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-envelope\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:46:24.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 513,\n" +
                "                    \"name\": \"聊天用户管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/chatcustomerlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/chatcustomerlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"0c794a81830f40c68efea63697901931\",\n" +
                "                    \"pkey\": \"fa531781f6664e728d965dd2da439154\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-comment\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:47:41.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 517,\n" +
                "                    \"name\": \"工单类别管理\",\n" +
                "                    \"shirourl\": \"/language.do?u=/admin/web/appworkordercategorylist\",\n" +
                "                    \"url\": \"/language.do?u=/admin/web/appworkordercategorylist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"793e4dbb25bf4189aa8ee002fa83cd4d\",\n" +
                "                    \"pkey\": \"123c63bf5fb44f1a815644f9227b582f\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tag\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-14T22:05:51.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 537,\n" +
                "                    \"name\": \"推荐佣金配置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/commendConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/commendConfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"3a1f068abca94362be526ad57d36f96a\",\n" +
                "                    \"pkey\": \"68a81358219c421e993549bebc652977\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-14T23:09:35.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 540,\n" +
                "                    \"name\": \"充提手续费设置\",\n" +
                "                    \"shirourl\": \"/web/appconfig/page/financeConfig\",\n" +
                "                    \"url\": \"/web/appconfig/page/postfinanceConfig\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"abc79927d9b54364a6a86c4d97c0fdca\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-04-03T16:31:30.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 688,\n" +
                "                    \"name\": \"平台资金总量统计\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/excoinsumlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/excoinsumlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"6f64721c579d46b7a521917de844194a\",\n" +
                "                    \"pkey\": \"3f87beaa32c04056859599e4705c4e64\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-08T16:43:51.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 292,\n" +
                "                    \"name\": \"充值申请审核\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/apptransactionlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/apptransactionlist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"47a8d0f5ca074070827801b48d38b556\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-eye-open\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:30:05.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 475,\n" +
                "                    \"name\": \"已实名用户管理\",\n" +
                "                    \"shirourl\": \"/customer/appcustomer/toCustomer.do?isReal=1\",\n" +
                "                    \"url\": \"/customer/appcustomer/toCustomer.do?isReal=1\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:33:38.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 484,\n" +
                "                    \"name\": \"佣金获取明细\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/commend/appcommendtradelist\",\n" +
                "                    \"url\": \"/v.do?u=admin/commend/appcommendtradelist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"771d70cd99604d62b2e5b24a1e8817b3\",\n" +
                "                    \"pkey\": \"68a81358219c421e993549bebc652977\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:35:07.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 488,\n" +
                "                    \"name\": \"手动提币\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exdigitalmoneyaccount/getCoin111\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"3411bb95d31c42ab95a85334b658decb\",\n" +
                "                    \"pkey\": \"3d71780e2e814fe4af5609473282e066\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:36:40.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 492,\n" +
                "                    \"name\": \"清除实名审核\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/auditall\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"e3fabc5a77834b478e60ee560c099cb0\",\n" +
                "                    \"pkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:39:42.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 499,\n" +
                "                    \"name\": \"重置安全策略\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/resetSecurity\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"c9882c776b644f63a94e21b5f878f648\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:45:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 510,\n" +
                "                    \"name\": \"站内信草稿箱\",\n" +
                "                    \"shirourl\": \"/web/appmessage/toDraftBox/none\",\n" +
                "                    \"url\": \"/web/appmessage/toDraftBox/none\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"4d70dbdadc7643b7a5575709676592ae\",\n" +
                "                    \"pkey\": \"d6b8e0b5d8d94091879c3d0f45c0f08a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-trash\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:46:41.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 514,\n" +
                "                    \"name\": \"聊天记录管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/chatrecordlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/chatrecordlist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"1c2549a4d7034f7f9fde6f2e9679f687\",\n" +
                "                    \"pkey\": \"fa531781f6664e728d965dd2da439154\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-pencil\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:47:58.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 518,\n" +
                "                    \"name\": \"工单任务处理\",\n" +
                "                    \"shirourl\": \"/language.do?u=/admin/web/appworkorderlist\",\n" +
                "                    \"url\": \"/language.do?u=/admin/web/appworkorderlist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"71a10c72ead445938b5ab6f3537169c8\",\n" +
                "                    \"pkey\": \"123c63bf5fb44f1a815644f9227b582f\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-bookmark\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-10T22:20:38.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 296,\n" +
                "                    \"name\": \"成功充值查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/apptransactionsuccesslist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/apptransactionsuccesslist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"2a1be4e6bd784f8ba225567543ff17f9\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:30:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 476,\n" +
                "                    \"name\": \"白名单用户管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/web/whitelistlist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/web/whitelistlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"75fe2f3f075640508acc5bca30477651\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:33:57.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 485,\n" +
                "                    \"name\": \"佣金派发管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/commend/appcommendmoneylist\",\n" +
                "                    \"url\": \"/v.do?u=admin/commend/appcommendmoneylist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"12f5902ada974a4d87e754c9a6b0365c\",\n" +
                "                    \"pkey\": \"68a81358219c421e993549bebc652977\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-export\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:35:25.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 489,\n" +
                "                    \"name\": \"刷新充币记录\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exdigitalmoneyaccount/refreshUserCoin111\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"90f2658483114aef98036ceb8c03715b\",\n" +
                "                    \"pkey\": \"3d71780e2e814fe4af5609473282e066\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:37:01.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 493,\n" +
                "                    \"name\": \"重置密码\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/resetPassword\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"1e404702be984d2195829434e904be89\",\n" +
                "                    \"pkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:45:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 511,\n" +
                "                    \"name\": \"手动发信记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appmessagelist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appmessagelist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"f04f8a3bf67a4d91aadf8e96b7d185d1\",\n" +
                "                    \"pkey\": \"d6b8e0b5d8d94091879c3d0f45c0f08a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-hand-up\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:46:58.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 515,\n" +
                "                    \"name\": \"敏感词汇设置\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/chatsensitivelist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/chatsensitivelist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"840ff1c4feac4d95b349df4106ac2bbb\",\n" +
                "                    \"pkey\": \"fa531781f6664e728d965dd2da439154\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-info-sign\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T21:11:56.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 519,\n" +
                "                    \"name\": \"实名审核\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/audit\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"ec3bd5db46ba41fda68556aa8e25f9a4\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-10T22:17:47.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 295,\n" +
                "                    \"name\": \"失败充值查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/apptransactionfaillist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/apptransactionfaillist\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"1de8abfe88444ea3bef6d84915f62634\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:29:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 473,\n" +
                "                    \"name\": \"注册用户管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-user\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:34:15.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 486,\n" +
                "                    \"name\": \"佣金派发记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/commend/appcommendrebatlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/commend/appcommendrebatlist\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"6d2360a0fb4748dcae1c484dbe031623\",\n" +
                "                    \"pkey\": \"68a81358219c421e993549bebc652977\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-duplicate\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:35:44.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 490,\n" +
                "                    \"name\": \"刷新以太坊充币记录\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exdigitalmoneyaccount/refreshUserETH111\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"925be46aaa9b4a4b857a98e12b53d758\",\n" +
                "                    \"pkey\": \"3d71780e2e814fe4af5609473282e066\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:37:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 494,\n" +
                "                    \"name\": \"禁用\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/forbidden\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"07ad5112f46c47b988d982c77a78b072\",\n" +
                "                    \"pkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:40:31.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 501,\n" +
                "                    \"name\": \"实名批量通过\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/moreAudit\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"a2c8ad992fd04be8bfa13c08b0faa96a\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-02-12T23:18:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 630,\n" +
                "                    \"name\": \"设备白名单管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=/admin/device/logindevicerecordlist\",\n" +
                "                    \"url\": \"/v.do?u=/admin/device/logindevicerecordlist\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"248a1a434c87405a97c039b0949ef518\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-hdd\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-23T14:42:49.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 322,\n" +
                "                    \"name\": \"提现申请审核\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/apptransactionwapplylist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/apptransactionwapplylist\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"0f8f577952e44bf9ab121e2d511b6bb7\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-open\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:30:40.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 477,\n" +
                "                    \"name\": \"银行卡片管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/customer/appbankcardlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/customer/appbankcardlist\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"f66e09bc2c334da5a1ade51c5e650d79\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-credit-card\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:37:44.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 495,\n" +
                "                    \"name\": \"解禁\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/permissible\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"d57cd09466204df7bf8cfb5a354f3dfb\",\n" +
                "                    \"pkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:40:54.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 502,\n" +
                "                    \"name\": \"清除实名\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/auditall\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"991885efa5524478a2e88f1cd404a55c\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-23T14:43:45.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 317,\n" +
                "                    \"name\": \"成功提现查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/apptransactionwsuccess\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/apptransactionwsuccess\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"62308e3a56064e04905add3d4b421599\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:31:06.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 478,\n" +
                "                    \"name\": \"用户账户管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exdigitalmoneyaccountlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exdigitalmoneyaccountlist\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"3d71780e2e814fe4af5609473282e066\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-xbt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:32:58.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 482,\n" +
                "                    \"name\": \"推荐用户管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"68a81358219c421e993549bebc652977\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-heart\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:38:07.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 496,\n" +
                "                    \"name\": \"交易开启\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/fnOpenChange\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"9df1764abb7540d29f8b2f7ae8bce81f\",\n" +
                "                    \"pkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:41:20.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 503,\n" +
                "                    \"name\": \"重置密码\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/resetPassword\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"c60401fe4fb946b0bc4c30d261c490ef\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-12T18:49:11.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 521,\n" +
                "                    \"name\": \"用户佣金明细\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/appcoinrewardrecordlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/appcoinrewardrecordlist\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"e2c4863b95d54773b2fe824b32bf42fe\",\n" +
                "                    \"pkey\": \"68a81358219c421e993549bebc652977\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-piggy-bank\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-15T19:43:18.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 655,\n" +
                "                    \"name\": \"平台账户统计\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/excoinsumlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/excoinsumlist\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"ec622970048f4bccaa6014abb465fadd\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-briefcase\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-23T14:45:08.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 318,\n" +
                "                    \"name\": \"失败提现查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/apptransactionwfaillist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/apptransactionwfaillist\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"0d0606bd1a2749e2aad7c9e7dfc24666\",\n" +
                "                    \"pkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:31:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 479,\n" +
                "                    \"name\": \"提币地址管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exdmcustomerpublickeylist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exdmcustomerpublickeylist\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"5af392689cc94c4faeb7e6a42461e4c6\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-download-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:38:30.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 497,\n" +
                "                    \"name\": \"交易关闭\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/fnCloseChange\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"263ae1d5137044a49ccf4a661b80b663\",\n" +
                "                    \"pkey\": \"1414ad52cfe44ab58447049e8da7f41d\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:41:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 504,\n" +
                "                    \"name\": \"禁用\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/forbidden\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"08fa18db3478433f8450e9b44f64d906\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-08T16:42:37.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 291,\n" +
                "                    \"name\": \"充值提现管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"2534b4e1114d4651823414b1d4d34704\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-upload\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:31:46.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 480,\n" +
                "                    \"name\": \"用户资产核算\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/customer/checkaccount\",\n" +
                "                    \"url\": \"/v.do?u=admin/customer/checkaccount\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"431b8353fd9d4ac7979067c5bff792d7\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-jpy\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:42:05.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 505,\n" +
                "                    \"name\": \"解禁\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/permiss\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"7a50d616fdb64eb0b321c620d2761e26\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-06-13T18:45:45.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 46,\n" +
                "                    \"name\": \"充币提币管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"3bd75909717a4b108fa3f38be6205d38\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-btc\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:32:10.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 481,\n" +
                "                    \"name\": \"用户缓存核算\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/customer/redischeckaccount\",\n" +
                "                    \"url\": \"/v.do?u=admin/customer/redischeckaccount\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"66d9febe53734aeabe37653521189af5\",\n" +
                "                    \"pkey\": \"92f76b619dad48a39c134c400e27d021\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-refresh\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:42:24.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 506,\n" +
                "                    \"name\": \"交易开启\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/open\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"2244fcebcecd4bbfa9335c71d6cad4ea\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:42:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 507,\n" +
                "                    \"name\": \"交易关闭\",\n" +
                "                    \"shirourl\": \"/admin/customer/appcustomer/close\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 9,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"9e8d12662beb4727ac5db1528001fb4d\",\n" +
                "                    \"pkey\": \"5e7aac9f742c4f609a5a72ee38d22030\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-04-03T16:30:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 687,\n" +
                "                    \"name\": \"资金账户统计\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 9,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"3f87beaa32c04056859599e4705c4e64\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-signal\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:44:31.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 508,\n" +
                "                    \"name\": \"手动发信管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 11,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"d6b8e0b5d8d94091879c3d0f45c0f08a\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-send\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:46:08.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 512,\n" +
                "                    \"name\": \"聊天室管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 12,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"fa531781f6664e728d965dd2da439154\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-comment\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:47:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 516,\n" +
                "                    \"name\": \"客户工单管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 13,\n" +
                "                    \"appname\": \"admin\",\n" +
                "                    \"mkey\": \"123c63bf5fb44f1a815644f9227b582f\",\n" +
                "                    \"pkey\": \"admin\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-paperclip\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"oauth\": [\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2017-11-30T00:45:04.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 4,\n" +
                "                    \"name\": \"root\",\n" +
                "                    \"shirourl\": \"/oauth\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"oauth\",\n" +
                "                    \"pkey\": \"全球化\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:05:13.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 253,\n" +
                "                    \"name\": \"站点基础词汇\",\n" +
                "                    \"shirourl\": \"/web/appconfig/toBasePage/baseConfigzh_CN\",\n" +
                "                    \"url\": \"/web/appconfig/toBasePage/baseConfigzh_CN\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"036305b4292d4498b8947371904f7c0b\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tower\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:13:53.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 262,\n" +
                "                    \"name\": \"文稿内容管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/apparticletree\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/apparticletree\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"c18351e2d0ae4e3aae67caf20b3aa37c\",\n" +
                "                    \"pkey\": \"ce226c53e5f149dba93d2ed04049c75f\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-27T17:34:07.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 284,\n" +
                "                    \"name\": \"电邮接口配置\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/mailconfiglist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/mailconfiglist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"a3e6dcec6789409c91aa2cd7b8add701\",\n" +
                "                    \"pkey\": \"7f78285f693344f0be518182e03267d8\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-envelope\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-27T17:34:32.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 285,\n" +
                "                    \"name\": \"电邮模板管理\",\n" +
                "                    \"shirourl\": \"/language.do?u=/admin/web/mailtemplatelist\",\n" +
                "                    \"url\": \"/language.do?u=/admin/web/mailtemplatelist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"de8846d00d1a4a54ba3c870ce3ff3b6b\",\n" +
                "                    \"pkey\": \"7f78285f693344f0be518182e03267d8\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-book\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-27T17:34:54.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 286,\n" +
                "                    \"name\": \"电邮发送记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/maillist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/maillist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"32f9db1f346141dda7429977a4877d8c\",\n" +
                "                    \"pkey\": \"7f78285f693344f0be518182e03267d8\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-27T17:35:37.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 287,\n" +
                "                    \"name\": \"系统信件模板\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appmessagecategorylist\",\n" +
                "                    \"url\": \"/language.do?u=admin/web/appmessagecategorylist&amp;messageCategory=zh_CN\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"3ba5cc6a43c94f7f9c9553ce38180f1d\",\n" +
                "                    \"pkey\": \"38d9a646a6c043ec8256046ddeaab1b8\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-envelope\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:58:17.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 457,\n" +
                "                    \"name\": \"全球化货币管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"232d1cd128f046d38d72384ad01ca2c2\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-btc\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:00:55.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 458,\n" +
                "                    \"name\": \"法币信息管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exlawcoinlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exlawcoinlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"303961847eb1437d8cc24e518e4e2e98\",\n" +
                "                    \"pkey\": \"232d1cd128f046d38d72384ad01ca2c2\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-jpy\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:05:40.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 254,\n" +
                "                    \"name\": \"页签标题名称\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/frontPageName/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/frontPageName/pc\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"0ceaa75087424854a15d1e3af3d34787\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tags\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:14:19.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 263,\n" +
                "                    \"name\": \"文稿类别管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appcategorytree\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appcategorytree\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"a8e7105862014062b4e553fc1cd82c5a\",\n" +
                "                    \"pkey\": \"ce226c53e5f149dba93d2ed04049c75f\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-folder-open\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T14:36:06.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 267,\n" +
                "                    \"name\": \"banner管理\",\n" +
                "                    \"shirourl\": \"/web/appbanner/toList/banner\",\n" +
                "                    \"url\": \"/web/appbanner/toList/banner\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"17242a99d9b6450787c52f212cc8aaca\",\n" +
                "                    \"pkey\": \"31043b67a8cf4f2398dfa45c46c73dcb\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-picture\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T14:41:00.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 272,\n" +
                "                    \"name\": \"短信模板管理\",\n" +
                "                    \"shirourl\": \"/web/appsmstemplate/toList\",\n" +
                "                    \"url\": \"/web/appsmstemplate/toList\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"bd92c47ade2a4198b7d536d6f9808c19\",\n" +
                "                    \"pkey\": \"5eafcefd580f479f8ad1797c0efca61d\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-comment\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-27T17:36:00.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 288,\n" +
                "                    \"name\": \"系统信件记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appmessagelist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appmessagecategorysee\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"d856038359124050a1ddd7ac9f60e666\",\n" +
                "                    \"pkey\": \"38d9a646a6c043ec8256046ddeaab1b8\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:43:09.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 297,\n" +
                "                    \"name\": \"APP语言包翻译\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-phone\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:44:45.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 299,\n" +
                "                    \"name\": \"底部标签词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/appBottomLabelWord/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/appBottomLabelWord/app\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"7186e2e41f594767aec5da0600d0e856\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-font\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-07T18:50:16.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 344,\n" +
                "                    \"name\": \"站点配图管理\",\n" +
                "                    \"shirourl\": \"/web/appbanner/toList/sitemap\",\n" +
                "                    \"url\": \"/web/appbanner/toList/sitemap\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"e9c3e2c3d0cf4045860cd043357b608f\",\n" +
                "                    \"pkey\": \"31043b67a8cf4f2398dfa45c46c73dcb\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-eye-open\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T17:01:13.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 459,\n" +
                "                    \"name\": \"兑换汇率管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/excointomoneylist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/excointomoneylist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"245e4c31a9c84c2ab50782d76b7a2b36\",\n" +
                "                    \"pkey\": \"232d1cd128f046d38d72384ad01ca2c2\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-resize-small\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:04:47.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 252,\n" +
                "                    \"name\": \"WEB语言包翻译\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-globe\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:06:21.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 255,\n" +
                "                    \"name\": \"导航菜单名称\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/navMenuName/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/navMenuName/pc\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"c885f195dee54fceaf74b66676273653\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-send\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T14:50:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 273,\n" +
                "                    \"name\": \"短信发送记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/web/appsmssendlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/web/appsmssendlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"b178c4d901a14bd5a2af8fd3ce910db0\",\n" +
                "                    \"pkey\": \"5eafcefd580f479f8ad1797c0efca61d\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-duplicate\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:50:42.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 300,\n" +
                "                    \"name\": \"顶部导航词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/appTopNavWord/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/appTopNavWord/app\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"f9f21b2bd26b422099b73bc62be6adc1\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-bold\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:06:51.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 256,\n" +
                "                    \"name\": \"注册登录词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/registLoginTerms/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/registLoginTerms/pc\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"f69a6db8a22f46288e438d5eddc5ef73\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tasks\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:12:41.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 261,\n" +
                "                    \"name\": \"多语种文稿管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"ce226c53e5f149dba93d2ed04049c75f\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-edit\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:51:19.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 301,\n" +
                "                    \"name\": \"注册登录词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/appRegistLoginWord/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/appRegistLoginWord/app\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"0e582d98eed349b09866e737afdd17b0\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-italic\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:07:17.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 257,\n" +
                "                    \"name\": \"交易相关词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/tradingVocabulary/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/tradingVocabulary/pc\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"fb4e2df758804c078bb18836015f31a0\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-shopping-cart\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T14:34:44.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 264,\n" +
                "                    \"name\": \"多语种配图管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"31043b67a8cf4f2398dfa45c46c73dcb\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-picture\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:51:42.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 302,\n" +
                "                    \"name\": \"交易相关词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/appTradeWord/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/appTradeWord/app\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"d55891a11d524ca8a52705b1a676dd07\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-text-height\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-29T22:35:43.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 616,\n" +
                "                    \"name\": \"OTC交易词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/otc/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/otc/pc\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"ec7f42ca4db94f1f924f375ce72c576d\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-30T15:58:13.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 618,\n" +
                "                    \"name\": \"杠杆词汇管理\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/lend/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/lend/pc\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"3987ca4099e9492f86c213be3bc339f0\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-01-03T16:47:24.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 624,\n" +
                "                    \"name\": \"法币交易词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/appLegalCurrency/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/appLegalCurrency/app\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"b5bf81e2736247f58c414afbaf6161e5\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T14:39:33.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 270,\n" +
                "                    \"name\": \"多语种短信管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"5eafcefd580f479f8ad1797c0efca61d\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-comment\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:52:46.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 303,\n" +
                "                    \"name\": \"个人中心词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/appPersonalWord/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/appPersonalWord/app\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"a9b45d3e63e04b34bd1dc55224ae306a\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-text-width\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-16T00:59:45.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 306,\n" +
                "                    \"name\": \"挖矿分红词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/miningDividend/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/miningDividend/pc\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"5e98854d9f184c7fb4271316e7c54504\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-font\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:07:46.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 258,\n" +
                "                    \"name\": \"个人中心词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/personalCenter/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/personalCenter/pc\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"7b8bd5362717422ca422cb6ec2c9b356\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-user\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-27T17:31:51.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 282,\n" +
                "                    \"name\": \"多语种电邮管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"7f78285f693344f0be518182e03267d8\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-envelope\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:53:06.000+0000\",\n" +
                "                    \"modified\": \"2020-01-08T21:58:48.000+0000\",\n" +
                "                    \"id\": 304,\n" +
                "                    \"name\": \"其他页面词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/other/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/other/app\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"96379a89fa8644d68879f0f4a340fb27\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-align-left\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:08:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 259,\n" +
                "                    \"name\": \"其他页面词汇\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/other/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/other/pc\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"fc1664ef8035494fa607feb1f720ef46\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-bold\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-27T17:33:20.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 283,\n" +
                "                    \"name\": \"多语种信件管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"38d9a646a6c043ec8256046ddeaab1b8\",\n" +
                "                    \"pkey\": \"oauth\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-08-14T22:53:41.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 305,\n" +
                "                    \"name\": \"全部词汇汇总\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/appAll/app\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/appAll/app\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"a4de401e269444a3a46621fab568cca5\",\n" +
                "                    \"pkey\": \"a1dc981b49fc423f863d7470dbc65a1a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tasks\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-07-20T00:10:21.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 260,\n" +
                "                    \"name\": \"全部词汇汇总\",\n" +
                "                    \"shirourl\": \"/web/applanguage/toPage/all/pc\",\n" +
                "                    \"url\": \"/web/applanguage/toPage/all/pc\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"oauth\",\n" +
                "                    \"mkey\": \"65f4c6bd2ff24b63a8ae8f8c7f6a082e\",\n" +
                "                    \"pkey\": \"c0a9dcfd4f474268b0384fab724cb6a6\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-sort-by-alphabet\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"entrust\": [\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-07T11:03:48.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 381,\n" +
                "                    \"name\": \"root\",\n" +
                "                    \"shirourl\": \"/entrust\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"entrust\",\n" +
                "                    \"pkey\": \"币币\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:47:08.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 413,\n" +
                "                    \"name\": \"当前委托交易\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exentrustlistnow\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exentrustlistnow\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"a7063512ffbd4b13b7eba5d1df2d3533\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-bell\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:24:24.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 432,\n" +
                "                    \"name\": \"交易市场管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"57246ddba53b4b369e5b706003379559\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-flag\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:27:42.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 440,\n" +
                "                    \"name\": \"关闭\",\n" +
                "                    \"shirourl\": \"/admin/exchange/excointocoin/close\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"b847b109385a438691078c068278eeb1\",\n" +
                "                    \"pkey\": \"390e930ef4164fc2a1ca427c727387ae\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-06T17:35:20.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 589,\n" +
                "                    \"name\": \"手动修复K线\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/buildrecordexcel\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/buildrecordexcel\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"13db3541f17c4d09985eb7eb3760edb8\",\n" +
                "                    \"pkey\": \"e78cc0c8de8040e38ed863e413bf6e51\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-30T01:00:20.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 617,\n" +
                "                    \"name\": \"交易区管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/extradingarealist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/extradingarealist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"e30a946521d846f29b0f33b656e7ee20\",\n" +
                "                    \"pkey\": \"57246ddba53b4b369e5b706003379559\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-eur\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:48:18.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 642,\n" +
                "                    \"name\": \"预警币种管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdearlywarnlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdearlywarnlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"c9224aea1a094c65a25b505c57c5f592\",\n" +
                "                    \"pkey\": \"d44aeb6627ef41afb33c71cb72a9fca2\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:49:02.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 645,\n" +
                "                    \"name\": \"当前委托交易\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistnow\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistnow\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"ed1dd2c059b147e99a759b20b3ab03bb\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:49:25.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 646,\n" +
                "                    \"name\": \"历史委托交易\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdentrustlisthistory\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdentrustlisthistory\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"e9f23cf6d3204dc092949c725106c8d3\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:49:36.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 647,\n" +
                "                    \"name\": \"全部待成交委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdentrustlisting\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdentrustlisting\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"2687fa178f5d4639abf569a265e514bf\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:49:49.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 648,\n" +
                "                    \"name\": \"部分成交委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistpart\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistpart\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"0ae75c5edc0045dfbeb1068c09781411\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:50:04.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 649,\n" +
                "                    \"name\": \"部分成交撤销\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistcancelpart\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistcancelpart\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"d9be479214b44cddaafb1fc2eb49967c\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:50:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 650,\n" +
                "                    \"name\": \"全部成交委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdentrustlisted\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdentrustlisted\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"f62c3f9830ed48459801e704b972bfe1\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:50:41.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 651,\n" +
                "                    \"name\": \"全部撤销委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistcancel\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdentrustlistcancel\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"c5e5bae32aaa48ac8a4be8ca962d1173\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:50:56.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 652,\n" +
                "                    \"name\": \"成交订单记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdorderlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdorderlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"6b5935660a584fe59da0a3989e7e4b0e\",\n" +
                "                    \"pkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:51:34.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 654,\n" +
                "                    \"name\": \"挂单交易所\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdplatformlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdplatformlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"5f4c7e9df5f74d5a85890dbfa6c00c7d\",\n" +
                "                    \"pkey\": \"92f29efc245d42e6948e92fbc9178922\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-04-22T16:40:37.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 700,\n" +
                "                    \"name\": \"账户余额管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/thirdmatchup/thirdbalancelist\",\n" +
                "                    \"url\": \"/v.do?u=admin/thirdmatchup/thirdbalancelist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"203254dbacab46668568658f14ec420d\",\n" +
                "                    \"pkey\": \"d44aeb6627ef41afb33c71cb72a9fca2\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:46:36.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 412,\n" +
                "                    \"name\": \"委托交易管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tag\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:47:54.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 414,\n" +
                "                    \"name\": \"历史委托交易\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exentrustlisthistory\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exentrustlisthistory\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"8a88fccabf934ae388f49fb0dcf09f5c\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tag\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:27:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 439,\n" +
                "                    \"name\": \"交易对管理\",\n" +
                "                    \"shirourl\": \"/exchange/excointocoin/toList/none\",\n" +
                "                    \"url\": \"/exchange/excointocoin/toList/none\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"390e930ef4164fc2a1ca427c727387ae\",\n" +
                "                    \"pkey\": \"57246ddba53b4b369e5b706003379559\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-resize-small\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:27:58.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 441,\n" +
                "                    \"name\": \"添加\",\n" +
                "                    \"shirourl\": \"/admin/exchange/excointocoin/add\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"4641d8d8aa3e41e68bd00b8190554edb\",\n" +
                "                    \"pkey\": \"390e930ef4164fc2a1ca427c727387ae\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-13T01:28:56.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 530,\n" +
                "                    \"name\": \"交易账号绑定\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotdeepinfolist\",\n" +
                "                    \"orderno\": 1,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"60b7a8ec49394a659f613721c3dea8a3\",\n" +
                "                    \"pkey\": \"28b528494695409682c9422ef294e009\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-link\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:48:21.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 415,\n" +
                "                    \"name\": \"全部待成交委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exentrustlisting\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exentrustlisting\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"f9f7aa8951454ffeb123140101c132a1\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-folder-close\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:28:19.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 442,\n" +
                "                    \"name\": \"修改\",\n" +
                "                    \"shirourl\": \"/admin/exchange/excointocoin/modify\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"6bc9ebfb23f244d1b7ac1c93d0031e81\",\n" +
                "                    \"pkey\": \"390e930ef4164fc2a1ca427c727387ae\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:43:18.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 445,\n" +
                "                    \"name\": \"K线机器人管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"3d41c95a27644376ac1405eb02771fb3\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tower\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:43:51.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 446,\n" +
                "                    \"name\": \"交易账号绑定\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exrobotinfolist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotinfolist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"31e1a747145847b68bc0213f73b929ef\",\n" +
                "                    \"pkey\": \"3d41c95a27644376ac1405eb02771fb3\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-paperclip\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:44:28.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 448,\n" +
                "                    \"name\": \"K线机器人配置\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exrobotparamlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotparamlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"9180d4d9edf347d9bc7bebccd6a838e2\",\n" +
                "                    \"pkey\": \"3d41c95a27644376ac1405eb02771fb3\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-wrench\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-13T01:29:21.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 531,\n" +
                "                    \"name\": \"深度机器人配置\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotdeepparamlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"c426542449594e71bb7727684ba44186\",\n" +
                "                    \"pkey\": \"28b528494695409682c9422ef294e009\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-cog\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-13T17:36:19.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 536,\n" +
                "                    \"name\": \"K线修复记录\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/buildrecordlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"8cc9b5f9ec214f2da86b42a3be13048d\",\n" +
                "                    \"pkey\": \"e78cc0c8de8040e38ed863e413bf6e51\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-14T22:14:30.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 539,\n" +
                "                    \"name\": \"交易对回收站\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/excointocointrashlist\",\n" +
                "                    \"orderno\": 2,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"dcefdab4baf64f7eb66e1b746dc8c7a4\",\n" +
                "                    \"pkey\": \"57246ddba53b4b369e5b706003379559\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-trash\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:51:00.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 416,\n" +
                "                    \"name\": \"部分成交委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exentrustlistpart\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exentrustlistpart\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"48802f087cc14efaa7b7621798974605\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-adjust\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:28:37.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 443,\n" +
                "                    \"name\": \"开启\",\n" +
                "                    \"shirourl\": \"/admin/exchange/excointocoin/open\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"906c60c5032f4314bc5de6b2ed29fc6a\",\n" +
                "                    \"pkey\": \"390e930ef4164fc2a1ca427c727387ae\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-13T01:27:55.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 529,\n" +
                "                    \"name\": \"深度机器人管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"28b528494695409682c9422ef294e009\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-road\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-21T22:05:23.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 583,\n" +
                "                    \"name\": \"深度机器人监控\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exrobotdeepmonitorlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotdeepmonitorlist\",\n" +
                "                    \"orderno\": 3,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"cde57456dcdf46888681156f572dbc67\",\n" +
                "                    \"pkey\": \"28b528494695409682c9422ef294e009\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-blackboard\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:51:20.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 417,\n" +
                "                    \"name\": \"部分成交撤销\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exentrustlistcancelpart\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exentrustlistcancelpart\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"1ca68260cb5447cfad92a916a9d2c478\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tint\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T16:45:01.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 450,\n" +
                "                    \"name\": \"K线修复管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"e78cc0c8de8040e38ed863e413bf6e51\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-inbox\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-13T01:30:37.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 533,\n" +
                "                    \"name\": \"机器人运行日志\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotloglist\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"748baa6ad3cd418d80c2324b416f1758\",\n" +
                "                    \"pkey\": \"28b528494695409682c9422ef294e009\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-list-alt\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-21T21:30:54.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 582,\n" +
                "                    \"name\": \"K线机器人监控\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exrobotmonitorlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotmonitorlist\",\n" +
                "                    \"orderno\": 4,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"3cc90a4382b0478696511cb2e7bbc390\",\n" +
                "                    \"pkey\": \"3d41c95a27644376ac1405eb02771fb3\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-blackboard\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:51:47.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 418,\n" +
                "                    \"name\": \"全部成交委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exentrustlisted\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exentrustlisted\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"b15ee209906b48e882bf97ac7020d5d8\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-tags\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-13T01:31:37.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 534,\n" +
                "                    \"name\": \"机器人成交查询\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exrobotorderlist\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"e592da519f0f464d83196111f2bfa66b\",\n" +
                "                    \"pkey\": \"28b528494695409682c9422ef294e009\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-zoom-in\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:51:13.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 653,\n" +
                "                    \"name\": \"挂单交易所管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 5,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"92f29efc245d42e6948e92fbc9178922\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:52:06.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 419,\n" +
                "                    \"name\": \"全部撤销委托\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exentrustlistcancel\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exentrustlistcancel\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"d1c84016fb7b408a85efc941753477db\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-erase\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:48:01.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 641,\n" +
                "                    \"name\": \"挂单交易所账户\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 6,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"d44aeb6627ef41afb33c71cb72a9fca2\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-11T15:52:26.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 420,\n" +
                "                    \"name\": \"成交订单记录\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exorderinfolist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exorderinfolist\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"8f8a2bc6b86a47a6937de0713fdd305d\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-resize-small\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2019-03-12T19:48:49.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 644,\n" +
                "                    \"name\": \"挂单记录查询\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 7,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"3bed32b4c08043d080c4437ede0ee4d7\",\n" +
                "                    \"pkey\": \"entrust\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-09-13T01:26:49.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:39.000+0000\",\n" +
                "                    \"id\": 528,\n" +
                "                    \"name\": \"交易手续费查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exorderinfolistfees\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exorderinfolistfees\",\n" +
                "                    \"orderno\": 8,\n" +
                "                    \"appname\": \"entrust\",\n" +
                "                    \"mkey\": \"f23374c6cefc40daae17d6240ffff510\",\n" +
                "                    \"pkey\": \"79a95ef67aa24dcdbb708ee99b566b6a\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-search\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"otc\": [\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:53:42.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 592,\n" +
                "                    \"name\": \"root\",\n" +
                "                    \"shirourl\": \"/otc\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"otc\",\n" +
                "                    \"pkey\": \"OTC\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:55:38.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 594,\n" +
                "                    \"name\": \"OTC规则管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"0be2e554d36c40a19972190175d39326\",\n" +
                "                    \"pkey\": \"otc\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:55:59.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 595,\n" +
                "                    \"name\": \"交易币种管理\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/exproductotclist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/exproductotclist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"4f472ccf652e4546b1ba375bc547595c\",\n" +
                "                    \"pkey\": \"0be2e554d36c40a19972190175d39326\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:56:22.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 596,\n" +
                "                    \"name\": \"添加\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exproduct/otcAdd\",\n" +
                "                    \"url\": \"/admin/exchange/exproduct/otcAdd\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"acadc2fb442747099acd45513821a5ee\",\n" +
                "                    \"pkey\": \"4f472ccf652e4546b1ba375bc547595c\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:56:49.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 597,\n" +
                "                    \"name\": \"修改\",\n" +
                "                    \"shirourl\": \"/admin/exchange/exproduct/otcAdd\",\n" +
                "                    \"url\": \"/admin/exchange/exproduct/otcAdd\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"7fb63aa805ce4434875ee39b8801dacd\",\n" +
                "                    \"pkey\": \"4f472ccf652e4546b1ba375bc547595c\",\n" +
                "                    \"type\": \"button\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:57:04.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 598,\n" +
                "                    \"name\": \"OTC订单管理\",\n" +
                "                    \"shirourl\": \"\",\n" +
                "                    \"url\": \"\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"c3db45a5ce88438683354a2cb3ef8990\",\n" +
                "                    \"pkey\": \"otc\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-th-large\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:57:51.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 599,\n" +
                "                    \"name\": \"全部订单查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/otcapptransactionlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/otcapptransactionlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"24acbe8a2c1e4a8bb4cef813e0dc67ca\",\n" +
                "                    \"pkey\": \"c3db45a5ce88438683354a2cb3ef8990\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:58:17.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 600,\n" +
                "                    \"name\": \"进行中交易查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/otcapptransactionlist_jinxingzhong\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/otcapptransactionlist_jinxingzhong\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"3946aa41747f4efb9266f3b805023886\",\n" +
                "                    \"pkey\": \"c3db45a5ce88438683354a2cb3ef8990\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:58:30.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 601,\n" +
                "                    \"name\": \"已完成交易查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/otcapptransactionlist_yiwancheng\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/otcapptransactionlist_yiwancheng\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"16d0a1ccdbaa46068c2204a328d4adc1\",\n" +
                "                    \"pkey\": \"c3db45a5ce88438683354a2cb3ef8990\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:58:51.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 602,\n" +
                "                    \"name\": \"已取消交易查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/otcapptransactionlist_yiquxiao\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/otcapptransactionlist_yiquxiao\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"779513ae7de844eebd7398c4b0a551de\",\n" +
                "                    \"pkey\": \"c3db45a5ce88438683354a2cb3ef8990\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:59:06.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 603,\n" +
                "                    \"name\": \"申诉中交易查询\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/otcapptransactionlist_shensuzhong\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/otcapptransactionlist_shensuzhong\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"69968ec6d50a4df3b7bdd3c557640478\",\n" +
                "                    \"pkey\": \"c3db45a5ce88438683354a2cb3ef8990\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"saasId\": \"\",\n" +
                "                    \"created\": \"2018-11-28T20:59:21.000+0000\",\n" +
                "                    \"modified\": \"2019-05-31T16:59:40.000+0000\",\n" +
                "                    \"id\": 604,\n" +
                "                    \"name\": \"全部用户广告\",\n" +
                "                    \"shirourl\": \"/v.do?u=admin/exchange/releaseadvertisementlist\",\n" +
                "                    \"url\": \"/v.do?u=admin/exchange/releaseadvertisementlist\",\n" +
                "                    \"orderno\": 0,\n" +
                "                    \"appname\": \"otc\",\n" +
                "                    \"mkey\": \"e7e5320b5c4c45a2b4636ee7235d3d1b\",\n" +
                "                    \"pkey\": \"c3db45a5ce88438683354a2cb3ef8990\",\n" +
                "                    \"type\": \"menu\",\n" +
                "                    \"icon\": \"glyphicon glyphicon-star\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"menu\": [\n" +
                "            \"admin\",\n" +
                "            \"oauth\",\n" +
                "            \"website\",\n" +
                "            \"entrust\",\n" +
                "            \"c2ctrade\",\n" +
                "            \"dividendMin\",\n" +
                "            \"otc\"\n" +
                "        ],\n" +
                "        \"token\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhZG1pbiIsInNvdXJjZSI6InBjIiwiZXhwIjoxNTgyOTA0OTQ2LCJpYXQiOjE1ODI4MTg1NDZ9.YK4V2EkNde1bXqRwIU66us-bfgNjjwsZtQlF4QnagOE\",\n" +
                "        \"username\": \"admin\"\n" +
                "    },\n" +
                "    \"code\": \"\",\n" +
                "    \"version\": \"1.0\",\n" +
                "    \"size\": 0\n" +
                "}";

        JSONO
    }
}
