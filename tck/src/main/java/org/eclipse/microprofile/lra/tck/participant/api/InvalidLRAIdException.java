/*
 *******************************************************************************
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.eclipse.microprofile.lra.tck.participant.api;

import javax.ws.rs.WebApplicationException;
import java.net.URI;

public class InvalidLRAIdException extends WebApplicationException {
    private static final long serialVersionUID = 1271422145863321852L;
    private final URI lraId;

    /**
     * Invalid LRA id exception.
     *
     * @param lraId  LRA id that is behind this exception
     * @param message  error message of this exception
     * @param cause  cause exception
     */
    public InvalidLRAIdException(URI lraId, String message, Throwable cause) {
        super(String.format("%s, LRA id: %s", message, lraId.toASCIIString()), cause);

        this.lraId = lraId;
    }

    /**
     * Invalid LRA id exception.
     *
     * @param lraId  LRA id that is behind this exception
     * @param message  error message of this exception
     */
    public InvalidLRAIdException(URI lraId, String message) {
        super(String.format("%s, LRA id: %s", message, lraId.toASCIIString()));

        this.lraId = lraId;
    }

    public URI getLraId() {
        return this.lraId;
    }
}
