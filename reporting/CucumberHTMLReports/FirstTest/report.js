$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/blog.feature");
formatter.feature({
  "name": "blog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate blog entering functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user is in Blog page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters data in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.enterProducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "data should appear in search field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.verifyProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/features/login.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validate search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user is in search page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cproduct\u003e\" products",
  "keyword": "When "
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "Product \"\u003cproduct\u003e\" should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "MacBook Air"
      ]
    },
    {
      "cells": [
        "MacBook Pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user is in search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"iPhone\" products",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.enterProducts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.clickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"iPhone\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.verifyProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user is in search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"MacBook Air\" products",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.enterProducts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.clickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"MacBook Air\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.verifyProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user is in search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"MacBook Pro\" products",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.enterProducts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.clickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"MacBook Pro\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.verifyProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});