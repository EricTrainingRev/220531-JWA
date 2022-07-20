# What is performance testing
So far the kind of testing you have been doing would fall under the functional testing category: checking that your code is working as intended, whether in positive or negative situations, whether verifying state/behavior, etc. Performance testing comes into play after you have validated that your application is functioning correctly. This kind of testing is not to check if things work or not (since you have already done this) but instead it is to check the capabilities of the application. This is what performance testing is all about.

There are a few common performance tests that are done consistently:
- Load testing
    - how well does your application handle multiple users?
- Stress testing
    - very similar to load testing, this kind of test checks to see how your application can handle weird/unique situations
        - what if 1000 people tried to log in to the same account at the same time?
        - what if 50 people try to buy the same item at the same time?
        - etc.
- Endurance testing
    - this is load testing over a long period of time: does your application still work as expected after a week or month of constant use? Sometimes problems won't reveal themselves until the application has been running or an extended period of time
        - have you set your logger to create new log files when the previous file gets too big?
        - did you forget to close your connections to your database, and so new connections are made with old ones never closing?
- Spike testing
    - these tests help determine how well (or poorly) your application can scale
        - can your application handle a sudden/overwhelming influx of users?
    - most modern cloud computing services (like Amazon and Google) provide tools for automatically scaling the resources you have access to based on the actual activity in your application. Spike testing can be used to check that your application is scaling appropriately based upon its use