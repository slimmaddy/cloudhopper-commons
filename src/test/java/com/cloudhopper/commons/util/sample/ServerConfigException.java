/**
 * Copyright (C) 2011 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.cloudhopper.commons.util.sample;

/**
 *
 * @author joelauer (twitter: @jjlauer or <a href="http://twitter.com/jjlauer" target=window>http://twitter.com/jjlauer</a>)
 */
public class ServerConfigException extends Exception {

    /**
     * Creates a new instance of <code>ServerConfigException</code> without detail message.
     */
    public ServerConfigException() {
    }


    /**
     * Constructs an instance of <code>ServerConfigException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ServerConfigException(String msg) {
        super(msg);
    }
}
