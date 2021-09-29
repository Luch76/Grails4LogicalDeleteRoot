grails.gorm.default.constraints = {
    '*'(nullable: true)
}

environments {
    development {
        dataSource {
            dbCreate= "update"
            //dbCreate - one of 'create', 'create-drop', 'update', 'validate', ''
            //Local
            //url="jdbc:oracle:thin:@(DESCRIPTION =    (ADDRESS = (PROTOCOL = TCP)(HOST = localhost)(PORT = 1521))    (CONNECT_DATA =      (SERVER = DEDICATED)      (SID = local)    )  )"
            //username="LUCH"
            //password="luch"
            url="jdbc:oracle:thin:@db202109291552_medium?TNS_ADMIN=C:\\Users\\belottol\\Development\\dassault\\Grails4LogicalDeleteRoot\\Grails4LogicalDeleteChild\\Wallet_DB202109291552"
            username="BLUE"
            password="a1P9A47Mr4cFY"
            //Logging
            logSql= true;
        }

    }
    test {
        dataSource {
            dbCreate= "validate"
            //dbCreate - one of 'create', 'create-drop', 'update', 'validate', ''
            url= "jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = localhost)(PORT = 1521)))(CONNECT_DATA =(SERVER = DEDICATED)(SERVICE_NAME = local)))"
            username= ""
            password= ""
            logSql= false
        }
    }
    production {
        dataSource {
            dbCreate = "validate"
            resourceRef="true"
            pooled = true
            //jndiName = "java:/comp/env/jdbc/traxGrails"
            //jndiName = "jdbc/traxGrails"
            //jndiName = "${System.getProperty('catalina.home') ? 'java:comp/env/' : ''}jdbc/traxGrails"
            jndiName = "${(System.getProperty('catalina.home') && (System.getProperty('java.class.path')).trim().toLowerCase().indexOf('tomcat') > 0 ) ? 'java:comp/env/' : ''}jdbc/myGrails"
            properties {
                jmxEnabled= true
                initialSize= 5
                maxActive= 50
                minIdle= 5
                maxIdle= 25
                maxWait= 10000
                maxAge= 600000
                timeBetweenEvictionRunsMillis= 5000
                minEvictableIdleTimeMillis= 60000
                validationQuery= "SELECT 1 from dual"
                validationQueryTimeout= 3
                validationInterval= 15000
                testOnBorrow= true
                testWhileIdle= true
                testOnReturn= false
                jdbcInterceptors= "ConnectionState"
                defaultTransactionIsolation= 2 //TRANSACTION_READ_COMMITTED

            }
        }
    }
}


