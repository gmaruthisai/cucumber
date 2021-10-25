$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/Addjobs.feature");
formatter.feature({
  "name": "Test Case _ Adding Jobs",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To add jobs Record",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to open my website",
  "keyword": "Given "
});
formatter.step({
  "name": "I have entered valid \"Admin\" and valid \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "name": "I created Addjobs Record \"\u003cTitle\u003e\" \"\u003cDesc\u003e\" \"\u003cNote\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Title",
        "Desc",
        "Note"
      ]
    },
    {
      "cells": [
        "hi",
        "A helo",
        "hiii"
      ]
    },
    {
      "cells": [
        "hfd",
        "Ahelo",
        "hfgfdii"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To add jobs Record",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to open my website",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definitions.Jobmethod.to_open_my_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have entered valid \"Admin\" and valid \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definitions.Jobmethod.i_have_entered_valid_and_valid(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I created Addjobs Record \"hi\" \"A helo\" \"hiii\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definitions.Jobmethod.i_have_created_Jobs_Record(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To add jobs Record",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to open my website",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definitions.Jobmethod.to_open_my_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have entered valid \"Admin\" and valid \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definitions.Jobmethod.i_have_entered_valid_and_valid(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I created Addjobs Record \"hfd\" \"Ahelo\" \"hfgfdii\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definitions.Jobmethod.i_have_created_Jobs_Record(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});