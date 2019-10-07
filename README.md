# WebFlux Sticky Sessions on PCF with JESSIONID cookie demo
## Demo Requirements

### Step 1 - Build the Application 

```sh
./gradlew build 
```

### Step 2 - Deploy the Application 

```sh
cf push webflux-cookie-demo -i 2 --random-route -p build/libs/webflux-cookie-demo-0.0.1-SNAPSHOT.jar
```

> Note : 2 Application instance count is specified with i parameter (value is set to 2)

### Step 3 - In a browser hit the root address of your site multiple times 

> Ensure that Instance Id returned is ALWAYS the same , unless browser cookies are specified