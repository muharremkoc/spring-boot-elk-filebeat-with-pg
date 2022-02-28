# spring-boot-elk-filebeat-wtih-pg


Spring Boot ElasticSearch-Logstash-Kibana with using Filebeat

## Installation

   - First,Create a filebeat.yml file and Editing your logs settings

   ![Filebeat](https://user-images.githubusercontent.com/80245013/155976627-2500587e-618f-439f-9a39-68e5f88cd53b.PNG) 

   - Second Create a logstash.conf and Configure your settings
 
   ![Capture](https://user-images.githubusercontent.com/80245013/155976683-5300eae4-15be-4c1f-a2bd-afb35a14cd99.PNG)

 
   - If you Using a Database,Create a environment file and define DB Settings

![EnvironmentFile](https://user-images.githubusercontent.com/80245013/155976706-7019254c-5a6d-4406-a860-41831b158118.PNG)


   - Maven Clean-Compile and Package then Create a Dockerfile your Project 

![Dockerfile](https://user-images.githubusercontent.com/80245013/155976729-055c4b4e-b55a-40a0-9c6f-b7da94a15062.PNG)



## Usage

- First,run filebeat's Dockerfile(Optional docker build -t your image tagname your Dockerfile)  
- Second,run logstash's Dockerfile(Optional docker build -t your image tagname your Dockerfile)  
- Create docker-compose.yml and configuration images settings and docker-compose up -d

## Technologies

- Spring Boot DevTools
- ElasticSearch
- Logstash
- Kibana
- Filebeat
- Lombok
- MapStruct
- SpringDoc OpenAPI
- Slf4j

## Owner
[Muharrem Koç](https://github.com/muharremkoc)
