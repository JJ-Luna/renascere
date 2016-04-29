/*
 The MIT License (MIT)
 
 Copyright (c) 2016 JJ Luna
 
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
 
 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.
 
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */
package renascere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import renascere.Global.*;

/**
 * @Description Java class that contains a set of variables to be used by the framework. 
 */
public class Vars {
    
    //Generic Browser and Elements variables and constants
    public static WebDriver         se_PBrowser          = null;
    public static WebDriver         se_SBrowser          = null;
    public static WebElement        se_PWebElement       = null;
    public static WebElement        se_SWebElement       = null;
    
    //Generic test variables
    public static browser           ts_Browser           = browser.FIREFOX;
    public static tType             ts_Type              = tType.REGRESSION;
    public static log               ts_Log               = log.MAXIMUM;
    public static String            ts_BHandler          = null;
    public static String            ts_URL               = null;
    public static String            ts_Uniqueness        = null;
    public static boolean           ts_WarningEnabled    = false;
    
    //Operating system variables and constants
    public static Long              os_Timer             = null;
    public static String            os_Name              = null;
    public static String            os_Path              = null;
    public static String            os_PathIn            = null;
    public static String            os_PathOut           = null;
    public static String            os_PathRef           = null;
    
    //Email Settings
    public static String            em_EmailAdd          = null;
    public static String            em_EmailPass         = null;
    public static String            em_EmailAddDefault   = "qatest@gmail.com";
    public static String            em_EmailBodyMetrics  = null;
    
    //Log counters
    public static int               log_Pass             = 0;
    public static int               log_Fail             = 0;
    public static int               log_Warning          = 0;
    public static int               log_Error            = 0;
    public static int               log_Step             = 0;
    
    //Generic variables and constants
    public static int               g_iTemp              = 0;
    public static String            g_sTemp              = null;
    public static String[]          g_saTemp             = null;
    public static String[][]        g_daTemp             = null;
}
