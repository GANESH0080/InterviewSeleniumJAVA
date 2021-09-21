$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flipKart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Created scenario 1 using scenario outline"
    },
    {
      "line": 2,
      "value": "# Executed 2 cases using scenario outline"
    },
    {
      "line": 3,
      "value": "# If value is mention in \u003c\u003e then that is Scenario outline"
    }
  ],
  "line": 5,
  "name": "Need to verify the Flipcart",
  "description": "",
  "id": "need-to-verify-the-flipcart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@flipkart"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Get the count of product",
  "description": "",
  "id": "need-to-verify-the-flipcart;get-the-count-of-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user navigate to website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on Search field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "search any \u003cproduct\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Get the count of product",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "need-to-verify-the-flipcart;get-the-count-of-product;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 15,
      "id": "need-to-verify-the-flipcart;get-the-count-of-product;;1"
    },
    {
      "cells": [
        "mobiles"
      ],
      "line": 16,
      "id": "need-to-verify-the-flipcart;get-the-count-of-product;;2"
    },
    {
      "cells": [
        "shirts"
      ],
      "line": 17,
      "id": "need-to-verify-the-flipcart;get-the-count-of-product;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3233777500,
  "status": "passed"
});
formatter.before({
  "duration": 147880600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Get the count of product",
  "description": "",
  "id": "need-to-verify-the-flipcart;get-the-count-of-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@flipkart"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user navigate to website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on Search field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "search any mobiles",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Get the count of product",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipKart.user_navigate_to_website()"
});
formatter.result({
  "duration": 3544634600,
  "status": "passed"
});
formatter.match({
  "location": "FlipKart.user_click_on_Search_field()"
});
formatter.result({
  "duration": 475560800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobiles",
      "offset": 11
    }
  ],
  "location": "FlipKart.search_any(String)"
});
formatter.result({
  "duration": 469797400,
  "status": "passed"
});
formatter.match({
  "location": "FlipKart.get_the_count_of_product()"
});
formatter.result({
  "duration": 1126321700,
  "status": "passed"
});
formatter.after({
  "duration": 1624363000,
  "status": "passed"
});
formatter.after({
  "duration": 253400,
  "status": "passed"
});
formatter.before({
  "duration": 1515934700,
  "status": "passed"
});
formatter.before({
  "duration": 214028700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Get the count of product",
  "description": "",
  "id": "need-to-verify-the-flipcart;get-the-count-of-product;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@flipkart"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user navigate to website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on Search field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "search any shirts",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Get the count of product",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipKart.user_navigate_to_website()"
});
formatter.result({
  "duration": 3569618100,
  "status": "passed"
});
formatter.match({
  "location": "FlipKart.user_click_on_Search_field()"
});
formatter.result({
  "duration": 425440100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shirts",
      "offset": 11
    }
  ],
  "location": "FlipKart.search_any(String)"
});
formatter.result({
  "duration": 636685100,
  "status": "passed"
});
formatter.match({
  "location": "FlipKart.get_the_count_of_product()"
});
formatter.result({
  "duration": 1346605600,
  "status": "passed"
});
formatter.after({
  "duration": 1635745800,
  "status": "passed"
});
formatter.after({
  "duration": 143500,
  "status": "passed"
});
formatter.before({
  "duration": 1566291300,
  "status": "passed"
});
formatter.before({
  "duration": 246779700,
  "status": "passed"
});
formatter.before({
  "duration": 112700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 21,
      "value": "# Created scenario 2 and using \" \""
    },
    {
      "line": 22,
      "value": "# \" \" means \" \" value we can pass through Feature file only"
    }
  ],
  "line": 24,
  "name": "Get the count of product",
  "description": "",
  "id": "need-to-verify-the-flipcart;get-the-count-of-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@amazon"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user navigate to \"https://www.amazon.in/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user search product",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.in/",
      "offset": 18
    }
  ],
  "location": "FlipKart.user_navigate_to_something(String)"
});
formatter.result({
  "duration": 5182762300,
  "status": "passed"
});
formatter.match({
  "location": "FlipKart.user_search_product()"
});
formatter.result({
  "duration": 5324380700,
  "status": "passed"
});
formatter.after({
  "duration": 78500,
  "status": "passed"
});
formatter.after({
  "duration": 1105308000,
  "status": "passed"
});
formatter.after({
  "duration": 65900,
  "status": "passed"
});
});