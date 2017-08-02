/*
   Copyright (c) 2013 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.linkedin.r2.filter;


/**
 * @author kparikh
 */
public class R2Constants
{
  public static final String OPERATION = "OPERATION";

  /**
   * The address of the remote client or last proxy that sent the http request.
   * Typically this value is set by servlets and accessible
   * for server side code
   * */
  public static final String REMOTE_ADDR = "REMOTE_ADDR";

  /**
   * The address of the remote server that received the http request.
   * Typically this value is set by transport client and accessible for
   * client side code after the request is sent
   * */
  public static final String REMOTE_SERVER_ADDR = "REMOTE_SERVER_ADDR";

  /**
   * The HTTP protocol that the client and server are communicated under.
   */
  public static final String HTTP_PROTOCOL_VERSION = "HTTP_PROTOCOL_VERSION";
  public static final String IS_SECURE = "IS_SECURE";
  public static final String CLIENT_CERT = "CLIENT_CERT";
  public static final String REQUEST_COMPRESSION_OVERRIDE = "REQUEST_COMPRESSION_OVERRIDE";
  public static final String RESPONSE_COMPRESSION_OVERRIDE = "RESPONSE_COMPRESSION_OVERRIDE";
  public static final String IS_QUERY_TUNNELED = "IS_QUERY_TUNNELED";
  public static final String FORCE_QUERY_TUNNEL = "FORCE_QUERY_TUNNEL";
  public static final String RESPONSE_DECOMPRESSION_OFF = "RESPONSE_DECOMPRESSION_OFF";
  public static final String IS_FULL_REQUEST = "IS_FULL_REQUEST";
  public static final int DEFAULT_DATA_CHUNK_SIZE = 8192;
  public static final boolean DEFAULT_REST_OVER_STREAM = false;
  public static final String RETRY_MESSAGE_ATTRIBUTE_KEY = "RETRY";
  public static final String EXPECTED_SERVER_CERT_PRINCIPAL_NAME = "EXPECTED_SERVER_CERT_PRINCIPAL_NAME";
}
