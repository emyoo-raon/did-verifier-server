/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.verifier.v1.service;

import org.omnione.did.data.model.did.DidDocument;
import org.omnione.did.data.model.vc.VcMeta;

/**
 * Storage service interface for finding DID document
 */
public interface StorageService {

    /**
     * Finds a DID document by its key URL.
     *
     * @param didKeyUrl URL of the DID key.
     * @return Found DID document.
     */
    DidDocument findDidDoc(String didKeyUrl);

}
