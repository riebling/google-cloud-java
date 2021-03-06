// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public interface DeviceCredentialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.DeviceCredential)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A public key used to verify the signature of JSON Web Tokens (JWTs).
   * When adding a new device credential, either via device creation or via
   * modifications, this public key credential may be required to be signed by
   * one of the registry level certificates. More specifically, if the
   * registry contains at least one certificate, any new device credential
   * must be signed by one of the registry certificates. As a result,
   * when the registry contains certificates, only X.509 certificates are
   * accepted as device credentials. However, if the registry does
   * not contain a certificate, self-signed certificates and public keys will
   * be accepted. New device credentials must be different from every
   * registry-level certificate.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyCredential public_key = 2;</code>
   */
  boolean hasPublicKey();
  /**
   * <pre>
   * A public key used to verify the signature of JSON Web Tokens (JWTs).
   * When adding a new device credential, either via device creation or via
   * modifications, this public key credential may be required to be signed by
   * one of the registry level certificates. More specifically, if the
   * registry contains at least one certificate, any new device credential
   * must be signed by one of the registry certificates. As a result,
   * when the registry contains certificates, only X.509 certificates are
   * accepted as device credentials. However, if the registry does
   * not contain a certificate, self-signed certificates and public keys will
   * be accepted. New device credentials must be different from every
   * registry-level certificate.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyCredential public_key = 2;</code>
   */
  com.google.cloud.iot.v1.PublicKeyCredential getPublicKey();
  /**
   * <pre>
   * A public key used to verify the signature of JSON Web Tokens (JWTs).
   * When adding a new device credential, either via device creation or via
   * modifications, this public key credential may be required to be signed by
   * one of the registry level certificates. More specifically, if the
   * registry contains at least one certificate, any new device credential
   * must be signed by one of the registry certificates. As a result,
   * when the registry contains certificates, only X.509 certificates are
   * accepted as device credentials. However, if the registry does
   * not contain a certificate, self-signed certificates and public keys will
   * be accepted. New device credentials must be different from every
   * registry-level certificate.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyCredential public_key = 2;</code>
   */
  com.google.cloud.iot.v1.PublicKeyCredentialOrBuilder getPublicKeyOrBuilder();

  /**
   * <pre>
   * [Optional] The time at which this credential becomes invalid. This
   * credential will be ignored for new client authentication requests after
   * this timestamp; however, it will not be automatically deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  boolean hasExpirationTime();
  /**
   * <pre>
   * [Optional] The time at which this credential becomes invalid. This
   * credential will be ignored for new client authentication requests after
   * this timestamp; however, it will not be automatically deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   * <pre>
   * [Optional] The time at which this credential becomes invalid. This
   * credential will be ignored for new client authentication requests after
   * this timestamp; however, it will not be automatically deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  public com.google.cloud.iot.v1.DeviceCredential.CredentialCase getCredentialCase();
}
