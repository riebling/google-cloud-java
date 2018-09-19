// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ListInfoTypesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListInfoTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional BCP-47 language code for localized infoType friendly
   * names. If omitted, or if localized strings are not available,
   * en-US strings will be returned.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional BCP-47 language code for localized infoType friendly
   * names. If omitted, or if localized strings are not available,
   * en-US strings will be returned.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Optional filter to only return infoTypes supported by certain parts of the
   * API. Defaults to supported_by=INSPECT.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional filter to only return infoTypes supported by certain parts of the
   * API. Defaults to supported_by=INSPECT.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}