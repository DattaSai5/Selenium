$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("backgrounddemo.feature");
formatter.feature({
  "line": 1,
  "name": "Check title",
  "description": "",
  "id": "check-title",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "driver installed",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page demowebshop",
  "keyword": "Given "
});
formatter.match({
  "location": "Backgrounddemo.i_am_on_the_home_page_demowebshop()"
});
formatter.result({
  "duration": 10265592800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify title of demowebshop",
  "description": "",
  "id": "check-title;verify-title-of-demowebshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I should see the title contains \"shop\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "shop",
      "offset": 33
    }
  ],
  "location": "Backgrounddemo.i_should_see_the_title_contains(String)"
});
formatter.result({
  "duration": 130756200,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login",
  "description": "",
  "id": "verify-login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#@valid"
    }
  ],
  "line": 4,
  "name": "Successful Login with valid credentials",
  "description": "",
  "id": "verify-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email and password and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should see logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "Signin.user_is_on_login_page()"
});
formatter.result({
  "duration": 3324129700,
  "status": "passed"
});
formatter.match({
  "location": "Signin.user_enters_email_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 5774007500,
  "status": "passed"
});
formatter.match({
  "location": "Signin.user_should_see_logout_link()"
});
formatter.result({
  "duration": 1015151800,
  "status": "passed"
});
});