# maven-survival-guide
Code and walkthrough for the talk "Apache Maven survival guide “Bring it on! -Mode” #no-external-tools #only-standard-plugins"

## Walkthrough

### Level 0: verify the project
    mvn verify
    
### Level 1: add some tests and make them run

 1. check for plugin updates
	`mvn versions:display-plugin-updates`
 2. add maven-enforcer-plugin
 3. check for plugin updates - again
	`mvn versions:display-plugin-updates`
 4. update maven-surefire-plugin to a version that supports Junit 5

### Bonus Level: Make build reproducible
    
 1. specify a version for all plugins in your build
 2. check if you caught them all with
	 `mvn versions:display-plugin-updates`
> **Note 1:** [Maven 3.8.1 will break your bulid if you have non-https URLs for repos](https://maven.apache.org/docs/3.8.1/release-notes.html#how-to-fix-when-i-get-a-http-repository-blocked)

> **Note 2:** You can use [Maven Wrapper](https://maven.apache.org/wrapper/) to bring your own Maven Version to build your project

### Level 2: add some dependencies and check if really need them

 1. add some dependencies - because your code needs them?
 2. check for used / unused dependencies
	`mvn org.apache.maven.plugins:maven-dependency-plugin:3.3.0:analyze`
 3. check the dependency tree to understand what is happening
	 `mvn dependency:tree` 
 4. marie kondo your dependencies - also check if your dependencies "spark joy"

### Level 3: secure your project

 1. check for CVEs with
	`mvn org.owasp:dependency-check-maven:check`
 2. understand what the result means for your project (target/dependency-check-report.html)
 3. update your affected dependencies 
 4. recheck for CVEs with
	 `mvn org.owasp:dependency-check-maven:check`

### Level 4: save time, save money and the planet earth

 1. use a current Java and Maven version for your builds: https://maven.soebes.team/scenario-1.html
 2. add the maven-profiler extension https://github.com/jcgay/maven-profiler
 3. find out where you can save time, money and the planet earth
    3.1. What (plugins) are executed in which phase?
		`mvn buildplan:list-phase`
		
    3.2. Profile different commands and see the differences:  
		`mvn clean install`  
		`mvn clean verify`  
		`mvn verify`  
		`mvn install`  
		
 4. find and kill stale resources
    `mvn verify -X`

### Level 5: paperwork 
   
 1. declare a license for your project
 2. check if you are going to jail and why (legal stuff / wasting bandwidth)  
	`mvn project-info-reports:dependencies`  
	`mvn license:third-party-report`
    
