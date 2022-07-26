# Cloud Services
Cloud services are services that are hosted on computers you do not have direct access to. These services are typically accessed via the web, and there are many benefits to making use of someone elses hardware instead of your own. Amazon Web Services (AWS) is one of the more popuar cloud service provides in the world, and they have done an excellent job of making their cloud services easily accessible. They utilize a pay-as-you-use model, sot that you only pay for the actual resources you use (think storage, computing power, data base usage, etc).

There are many benefits to utilizing cloud resources, and these benefits are not limited to AWS:

- Trade capital expenses for variable expenses
    - instead of needing to guess at your traffic/processing needs you can use a flexible cloud service that scales with your needs: if you are getting a lot of traffic and need lots of computational power you can get immediate access to them from a cloud provider. If you set up your own infastructure you do not have such immediate access to more resources if they become necessary.
- Benefit from a massive economy of scale
    - because all of our user actions can be aggregated to the cloud (it is all localized in the cloud) you can benefit from a pay-as-you-use model with all aspects of your application/product.
- You can stop guessing about capcity
    - Because cloud providers have access to massive amount of resources you don't need to guess at your  cpacity needs: cloud providers have gotten very good at providing auto-scalings features in their services that makes it very easy for your applications to be able to handle heavy traffic loads and small traffic loads whenever their respective situations arrise.
- You can increase your speed and agility when it comes to deployment
    - it used to be that you had to host your application locally and then expose it to the web: this came with all sorts of security risks you had to handle as a business. Now, with a cloud service provider like AWS, with a few clicks of the mouse pad you can upload an application and have it accessible to the world with basic security established
- Eliminate overhead costs of maintaining data centers
    - computers are expensive, and the more powerful they are, the more energy they need. If you are storing anything remotely valuable and or sensitive on them you need to protect them from people illegally accessing the information stored in them.
- You can go global in minutes
    - because most cloud providers like Amazon have global coverage you can choose what regions you want to deploy your product to to allow for a smooth interaction with your application. For instance, lets say you wanted to deploy your application for people on the West Coast of the United States: you could choose to deploy your application into a US West region with AWS which would lead to lower latency time and reduced lag for users of your application. 

# Cloud Computing Models

## Infastructure as a Service
This is a self-service model for managing remote data center infastructure: AWS offers this in the form of data centers. This essentially means that AWS itself is the Infastructure as a Service.

## Platform as a Service
This allows organizations to build, run, and manage applications without the IT infastructure needed to build them. For example, Amazon's Relational Database Service (RDS) follows a platform as a service model. You can use their databases, but you as the user must provide the means of interacting with said database (using dbeaver, your application, etc).

## Software as a Service
This model replaces the traditional on-device software with software that is liscensed on a subscription basis (typically). These kinds of software are usually hosted in the cloud which makes it much easier for new customers to begin using the service, and it provides a much lower bar of entry for those who have outdated equipment. Saleseforce is a good example of Software as a Service: it is a full application that you use entirely online and is hosted in the cloud