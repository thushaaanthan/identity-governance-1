/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.captcha.connector;

import java.util.Collections;
import java.util.Map;

/**
 * Captcha Post Validation Response .
 */
public class CaptchaPostValidationResponse {

    private boolean successfulAttempt;

    private boolean enableCaptchaResponsePath;

    private Map<String, String> captchaAttributes;

    public boolean isSuccessfulAttempt() {
        return successfulAttempt;
    }

    public void setSuccessfulAttempt(boolean successfulAttempt) {
        this.successfulAttempt = successfulAttempt;
    }

    public boolean isEnableCaptchaResponsePath() {
        return enableCaptchaResponsePath;
    }

    public void setEnableCaptchaResponsePath(boolean enableCaptchaResponsePath) {
        this.enableCaptchaResponsePath = enableCaptchaResponsePath;
    }

    public Map<String, String> getCaptchaAttributes() {
        if (captchaAttributes == null) {
            return Collections.emptyMap();
        }
        return captchaAttributes;
    }

    public void setCaptchaAttributes(Map<String, String> captchaAttributes) {
        this.captchaAttributes = captchaAttributes;
    }
}
