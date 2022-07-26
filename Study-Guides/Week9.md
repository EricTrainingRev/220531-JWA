## AWS Introduction (cloud vs on premise)
We have already started to use AWS services, but here we are going to look at it as a whole. AWS has blow up in popularity in recent years, and its success has caused many other Web Services providers to spring up too (Google Cloud Platform, Microsoft Azure are two major competitors). There are six advantages of these web services to be aware of:
1. Trade capital expense for variable expense.
    - instead of needing to guess at your traffic and processing needs you can use a felxible service that scales with your needs, both for the increase and decrease in traffic and processing power need.
2. Benefit from massive economies of scale.
    - because user actions are all aggregated in the cloud (read: it is all localized in the cloud and handled by the web service) you can benefit from a pay-as-you-go model that many web services providers like AWS use.
3. Stop guessing about capacity.
    - similar to the first bulletpoint, there is no need to guess at how much hardware and processing power you need: because of the flexibility of autoscaling you can avoid sitting on idle hardware or being unable to handle all the requests to your product
4. Increase speed and agility.
    - when you host your service locally you have to manually upgrade everything, which can take anywhere from hours to days. With cloud computing you have access to advanced hardware immediately.
5. Eliminate overhead cost of maintaining data centers
    - providers like AWS handle the maintanence of data centers, which means you don't need to budget for the servers, properties,maintanence crew, secruity, etc.
6. Go global in minutes.
    - because most services like AWS have global coverage you can choose what regions you want to deploy your app in and reduce latency and increase accessability of your product with a few mouse clicks

There are three models of Cloud Computing:
- Infastructure as a Service (IaaS):
    - a self-service model for managing remote data center infrastructures. AWS offers IaaS in the form of data centers. Essentially, this means that AWS itself is the IaaS
- Platform as a Service (PaaS):
    - allows organizations to build, run and manage applications without the IT infrastructure. AWS RDS is a PaaS: it provides a means of managing your product (storing the data related to it) without providing any infastructre to manage it (need dbeaver or another program to interface with the database)
- Software as a Service (SaaS):
    -  replaces the traditional on-device software with software that is licensed on a subscription basis. It is centrally hosted in the cloud. A good example is Salesforce
## AWS Regions and Availability
There is a potential downside to cloud based services: latency. The farther data has to travel the longer it takes for your service to work. To get around this AWS offers its services in ~24 different regions, with ~77 available zones in those regions. Regions are major geographic areas that hold physical data centers for Amazon. So, if you are developing in the USA, you want to make sure the region you developing in is close to where you physically are. Or, if you are deploying your product, you want to make sure you deploy it to all the regions where your customers are. 

If regions are the large geographic area, available zones are smaller logic centers within the regions that handle the actual operations. Each region has multiple available zones, each of which has back up power and networking capabilities. This reduces the harm of an available zone failing: if one area goes down the others can handle the workload of the failed zone until it is back up and running.
## DevOps Overview
Software Development and Operations (DevOps) is a methodology that combines the development, deployment, and maintanece of code into a single, streamlined process. Ideally, this process is automated as much as possible. There are 5 general steps to Devops:
1. Source code Control: Producing (writing) code and pushing to a repository
    - you should already be familiar with this step, it is just the creation of your code (following TDD and utilizing BDD) and publishing it to a central repository
2. Building and Testing Automation: Test basic functionality of code (Generally unit testing) and create a new, working build
    - you should be testing your code as you develope, but this is the final, overarching test. This round of testing is the one you want to generate documentation and reports from for either your client or other developers to see
3. Deploying to Staging: Deployment of working build to a temporary environment
    - This is a pre-configured enviornment where you can test the entirety of your application without affecting your production enviornment
4. Acceptance Testing: Undergo other more complex tests (systems, integration) within temporary environment
    - think of this as the final, official BDD test. This is where the entirety of the (supposedly) working application is put to the test. Again, it is from this test you will want to save your generated report and have it available to either the client or other developers
5. Deployment of Build: Migrate working build to Production environment accessible by end users
    - this is the actual deployment of your product

If you are developing with an Agile Mindset there are three practices to know that assist in the process of creating a smooth DevOps pipeline
- Continuous Integration
    - This is the practice of regularly and consistently merging code into a central repository. It also involves reviewing the code to make sure the integration is as smooth as possible
- Continuous Delivery
    - This is the pratice of automating the DevOps pipeline as much as you can. This means once your code is merged into the central repository it is downloaded and built/tested in a staging environment. This means steps 1-3 of the DevOps process should be automated, and step 4 should be too if you can manage it, though this is not always possible. Deploying to the production enviornment (step 5) should be done manually, since step 4 may reveal bugs you need to fix before deployment to production
- Continuous Deployment
    - Continuous Deployment is the process by which the entirety of the DevOps pipeline is automated, including deployment to production. You can think of it as the all encompassing Agile practice of DevOps, with each other practice being a subset of it:

## SonarCloud & SonarLint
These are static code quality tools(they don't need to compile/run your code) that help you find code "smells" in your application. These are things like:
- Data security issues
- Bugs
- confusing code
- redundant code
- unused imports
- empty code blocks
- etc.

Most IDEs have code quality tools built in, but these can provide more in-depth analysis of your code.
- SonarCloud
    - A cloud code analyizer that can review code loaded into a cloud-based repository, like github
        - Navigate to the Sonar Cloud Login Page, and select "Log in with Github"
        - Click on "Analyze your code" and follow the steps for project setup
        - Select the repository to analyze.
    - NOTE: for Java applications JDK 11 or later is needed for this to work
- SonarQube
    - A code review tool that can be built into a devops pipeline. Because it is more configurable it could been seen as more powerful
- SonarLint
    - an opensource plugin for many ides, it can be installed from your IDE's plugin marketplace.
    - NOTE: for Java applications JDK 11 or later is needed for this to work

## AWS S3
You can configure an S3 bucket to host static webpages for you (static webpages are those that have no server-side rendering), or you can use it to store a Jar file for your production/test environment, etc. To host a static website:
1. Click on your bucket in your S3 Management Console
2. Select Overview > Create Folder - this is where you will upload static HTML files from your computer to be hosted on the S3 bucket.
3. Select Upload and upload your html/css/js files/folders.
4. Select Properties
5. Select Static website hosting
6. Select Use this bucket to host a website > enter the name of the file we're hosting: any/directories/index.html.
7. Return to your bucket > click on the uploaded files > click Make public.
8. Visit the Object URL and you will see your static webpage hosted on your configured S3 bucket! You can also get the link from the static website hosting property section

## AWS Elastic Beanstalk
Elastic Beanstalk provides a convenient way of deploying Java applications (among others). You can choose a preconfigured template (for training purposes we use the free tier eligible option) and getting your application/environment up and running is as simple as uploading your preconfigured Jar file to the environment. AWS will handle creating a virtual machine, installing Java on it, and deploying your application.

## Github Actions
Github actions is a DevOps tool provided by Github that allows developers to control their DevOps pipeline all inside of Github. Continuous Delivery and Continuous Deployment are both achieveable using this system.
```yml
# basic example: Github will test/build your Java application with this file in the .github/workflow directory
name: Java CI with Maven

on:
  push:
    branches: [ "main" ]
  pull_request:
    branches: [ "main" ]

jobs:
  build:

    runs-on: ubuntu-latest # this will tell Github what operating system to build/test your app on

    steps:
    - uses: actions/checkout@v3
    - name: Set up JDK 11 # set this to 8 if using Java 8
      uses: actions/setup-java@v3
      with:
        java-version: '11' # set this to 8 if using Java 8
        distribution: 'temurin'
        cache: maven
    - name: Build with Maven
      run: mvn package # if your pom is located in a sub folder then write: mvn package -f path/to/pom/directory/
```
below is an example of how you can use Github Actions, AWS S3, and AWS Elastic Beanstalk to create a fully automated Devops Continuous Deployment Pipeline (Note: an IAM user role needs to be created giving full S3 and ElasticBeanstalk access)
```yml

name: Java CI with Maven

on:
  push:
    branches: [ "main" ]
  pull_request:
    branches: [ "main" ]

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v3
    - name: Set up JDK 8 # this example uses Java 8
      uses: actions/setup-java@v3
      with:
        java-version: '8' # needs to be 8, not 1.8 or 11 
        distribution: 'temurin'
        cache: maven
    - name: Build and test with maven # runs tests and builds jar file
      run: mvn package
    - name: Configure AWS Credentials # sets the aws IAM credentials to acces Elastic Beanstalk and S3 bucket
      uses: aws-actions/configure-aws-credentials@v1
      with:
        aws-access-key-id: ${{ secrets.ACCESS_KEY_ID }} # secrets must be set in the repo settings, under the secrets tab
        aws-secret-access-key: ${{ secrets.SECRET_ACCESS_KEY }}
        aws-region: "us-east-1" # make sure the region is whatever region your Elastic Beanstalk environment is in

    - name: Upload package to S3 bucket # updates jar file into S3 bucket with the most recent build. Notice syntax
      run: aws s3 cp the-jar-file.jar s3://name-of-bucket-goes-here

    - name: Create new ElasticBeanstalk Application Version # creates a new version of the application in Beanstalk
      run: |
        aws elasticbeanstalk create-application-version \
        --application-name NameGoesHere \
        --source-bundle S3Bucket="name-of-bucket-goes-here",S3Key="the-jar-file.jar" \
        --version-label "ver-${{ github.sha }}" \ 
        --description "commit-sha-${{ github.sha }}"

    - name: Deploy new ElasticBeanstalk Application Version # updates environment with new version of application
      run: aws elasticbeanstalk update-environment --environment-name NameGoesHere-env --version-label "ver-${{ github.sha }}"

```