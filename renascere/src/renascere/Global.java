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

import org.openqa.selenium.By;

/**
 * @Description Java interface that contains a set of constants and enums and global static information.
 */
public interface Global {
    
    public enum tType implements Global {
        SANITY, SMOKE, REGRESSION
    }
    
    public enum log implements Global {
        MINIMUM, NORMAL, MAXIMUM
    }
    
    public enum severity implements Global {
        LOW, NORMAL, HIGH, BLOCKER
    }
    
    public enum result implements Global {
        INFO, PASS, FAIL, WARNING, ERROR, EXEC
    }
    
    public enum browser implements Global {
        IE, FIREFOX, CHROME, SAFARI, OPERA, PHANTOMJS
    }
    
    public enum tAction implements Global {
        ENTER, SELECT, CHOOSE, PRINT, GETROW, GETCOL, GETCEL, COUNTROWS, COUNTCOLS, FINDTEXT
    }
    
    public enum tOperators implements Global {
        EQUALS, CONTAINS, ISNULL, GREATER, SMALLER
    }
    
    public enum object implements Global {
        PRESENT, VISIBLE, CLICKABLE
    }
    
    public enum oAction implements Global {
        CLICK, CLEAR, TYPE, REPLACE, SELECT, GETATT, GETPOS, GETSIZE, GETTEXT
    }
    
    //Gmail
    public String[]  sEmailProtocol   = new String[] {"mail.store.protocol","imaps"};
    public String[]  sEmailServers    = new String[] {"imap.gmail.com","smtp.gmail.com"};
    public String[]  sEmailAuth       = new String[] {"mail.smtp.auth","true"};
    public String[]  sEmailTls        = new String[] {"mail.smtp.starttls.enable","true"};
    public String[]  sEmailPort       = new String[] {"mail.smtp.port","587"};
    public String    sInboxFolderName = "INBOX";
    public String    sEmailBody       = "This is an unmonitored email inbox. Please do not reply to this email.\\n"
                                        + "----------------\\nThe QA Team";
    
    //Dates
    public String    dtLONG           = "MMM dd, yyyy hh:mm:ss z";
    public String    dtSHORT          = "MMddyyyyHHmmss";
    public String    dtSTD            = "MM/dd/yyyy";
    
    //Files
    public String    ioFolderInput    = "input";
    public String    ioFolderOutput   = "output";
    public String    ioFolderRef      = "references";
    public String    ioLogFile        = "testlogs.log";
    
    //Timing
    public int       gTimeOut         = 3;
    public int       gTimeOutLow      = 1;
    public int       gTimeOutHigh     = 5;
    public double    fTimeSecond      = 1;
    public double    fTimeHSecond     = 0.5;
    public double    fTimeQSecond     = 0.25;
    
    //Messages
    public String    sNewLine         = "\n";
    public String    sSeparator       = " || ";
    public String    sErrorMessage    = "An error has ocurred while: ";
    
    //Generic Objects
    public By        byColumn         = By.tagName("td");
    public By        byRow            = By.tagName("tr");
}   
