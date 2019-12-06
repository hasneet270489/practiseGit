$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Login to flipkart application",
  "description": "  I want to open browser and login to flipkart application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Multiple Logins",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MultipleLogins"
    }
  ]
});
formatter.step({
  "name": "I launch \u003cbrowsers\u003e and open url",
  "keyword": "Given "
});
formatter.step({
  "name": "I login to application",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "username",
        "hasneet270489@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "Honda@123"
      ]
    },
    {
      "cells": [
        "phoneNumber",
        "9654806255"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browsers",
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "chrome",
        "hasneet270489@gmail.com",
        "Honda@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Multiple Logins",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@MultipleLogins"
    }
  ]
});
formatter.step({
  "name": "I launch chrome and open url",
  "keyword": "Given "
});
formatter.match({
  "location": "ApplicationSteps.i_have_browser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login to application",
  "rows": [
    {
      "cells": [
        "username",
        "hasneet270489@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "Honda@123"
      ]
    },
    {
      "cells": [
        "phoneNumber",
        "9654806255"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.i_login(String,String\u003e)"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d78.0.3904.108)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HASNEET3674\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\HASNEE~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:60704}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: bca3ee54b4a3bdfc889b69e258df723f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat com.webdriver.Webconnector.type(Webconnector.java:64)\r\n\tat com.webdriver.Webconnector.login(Webconnector.java:135)\r\n\tat com.stepDefinations.ApplicationSteps.i_login(ApplicationSteps.java:36)\r\n\tat ✽.I login to application(file:src/test/resources/Features/login.feature:29)\r\n",
  "status": "failed"
});
});