package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL_WEB
     
    /**
     * <p></p>
     */
    public static Object ANDROID_PACKAGE_NAME
     
    /**
     * <p></p>
     */
    public static Object sehatq
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            URL_WEB = selectedVariables['URL_WEB']
            ANDROID_PACKAGE_NAME = selectedVariables['ANDROID_PACKAGE_NAME']
            sehatq = selectedVariables['sehatq']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
