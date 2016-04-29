/**
 * Copyright (C) 2016 NorthPage, Inc. - All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 */
package main;

import custom.AUTVars;
import custom.AUTGlobal.*;
import renascere.Vars;
import renascere.Global.*;

public class Master extends renascere.Renascere{
    /**
     * @Description Main class that drives all the tests.
     * @Param:         1: Environment : Has to be a ENUM from environment : Default: ts_Environment = QA
     * @Param:         2: Browser     : Has to be a ENUM from Frame_ctes.browserName     : Default: ts_Browser     = FIREFOX
     * @Param:         3: Log Level   : Has to be a ENUM from Frame_ctes.logLevel        : Default: ts_Log         = MAXIMUM
     * @Param:         4: Scope       : Has to be a ENUM from Frame_ctes.testType        : Default: ts_Type        = REGRESSION
     * @Param:         5: System      : Has to be a ENUM from Tests_ctes.appUnderTest    : Default: ts_Application = FULL
     */
    public static void main(String[] args) {
        getTestEnvironment();
        
        //Evaluate arguments: ARG 1 - ENVIRONMENT
        if (args.length > 0 && args[0] != null) {
            try {
                AUTVars.ts_Environment = testEnvironment.valueOf(args[0].toUpperCase());
            } catch(Exception e) {
                AUTVars.ts_Environment = testEnvironment.QA;
            }
        }
        
        //Evaluate arguments: ARG 2 - BROWSER
        if (args.length > 1 && args[1] != null) {
            try {
                Vars.ts_Browser = browserName.valueOf(args[1].toUpperCase());
            } catch(Exception e) {
                Vars.ts_Browser = browserName.FIREFOX;
            }
        }
            
        //Evaluate arguments: ARG 3 - LOG LEVEL
        if (args.length > 2 && args[2] != null) {
            try {
                Vars.ts_Log = logLevel.valueOf(args[2].toUpperCase());
            } catch(Exception e) {
                Vars.ts_Log = logLevel.MAXIMUM;
            }
        }
            
        //Evaluate arguments: ARG 4 - SCOPE
        if (args.length > 3 && args[3] != null) {
            try {
                Vars.ts_Type = testType.valueOf(args[3].toUpperCase());
            } catch(Exception e) {
                Vars.ts_Type = testType.REGRESSION;
            }
        }

        //Evaluate arguments: ARG 5 - APPLICATION
        if (args.length > 4 && args[4] != null) {
            try {
                AUTVars.ts_Application = appUnderTest.valueOf(args[4].toUpperCase());
            } catch(Exception e) {
                AUTVars.ts_Application = appUnderTest.FULL;
            }
        }
            
        //Revalidation for PRODUCTION
        Vars.ts_Type = AUTVars.ts_Environment.equals(testEnvironment.PRODUCTION) ?
                        testType.SMOKE : Vars.ts_Type;
            
        //Initialize tests
        logMessage(logEntry.EXEC, "Main Script.");
        logMessage(logEntry.INFO, "Environment under test: "   + AUTVars.ts_Environment + 
                                             ". Test Scope: "  + Vars.ts_Type + 
                                             ". Test System: " + AUTVars.ts_Application + 
                                             ". Browser: "     + Vars.ts_Browser + 
                                             ". Log level: "   + Vars.ts_Log);
        
        //Calling Scripts
        openBrowser(Vars.ts_Browser);
        
        //Test execution
        switch (AUTVars.ts_Application) {
               case API: 
                   Main_API.execute();
                   break;
               case INTERNAL: 
                   //Main_INTERNAL.execute();
                   break;
               case PORTAL:
                   //Main_EXTERNAL.execute();
                   break;
               default:
                   Main_Full.execute();
                   break;
        }
            
        //Closing browser and getting metrics
        closeBrowser();
        getTestMetrics();
        logMessage(logEntry.INFO, "******************** END ********************");
        logMessage(logEntry.INFO, "*********** MAIN SCRIPT COMPLETED ***********");
        logMessage(logEntry.INFO, "******************** END ********************");
    }
}
