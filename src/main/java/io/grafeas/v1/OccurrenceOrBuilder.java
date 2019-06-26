/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface OccurrenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Occurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. A URI that represents the resource for which the
   * occurrence applies. For example,
   * `https://gcr.io/project/image&#64;sha256:123abc` for a Docker image.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   */
  java.lang.String getResourceUri();
  /**
   *
   *
   * <pre>
   * Required. Immutable. A URI that represents the resource for which the
   * occurrence applies. For example,
   * `https://gcr.io/project/image&#64;sha256:123abc` for a Docker image.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   */
  com.google.protobuf.ByteString getResourceUriBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The analysis note associated with this occurrence, in
   * the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be
   * used as a filter in list requests.
   * </pre>
   *
   * <code>string note_name = 3;</code>
   */
  java.lang.String getNoteName();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The analysis note associated with this occurrence, in
   * the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be
   * used as a filter in list requests.
   * </pre>
   *
   * <code>string note_name = 3;</code>
   */
  com.google.protobuf.ByteString getNoteNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. This explicitly denotes which of the occurrence details are
   * specified. This field can be used as a filter in list requests.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind kind = 4;</code>
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Output only. This explicitly denotes which of the occurrence details are
   * specified. This field can be used as a filter in list requests.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind kind = 4;</code>
   */
  io.grafeas.v1.NoteKind getKind();

  /**
   *
   *
   * <pre>
   * A description of actions that can be taken to remedy the note.
   * </pre>
   *
   * <code>string remediation = 5;</code>
   */
  java.lang.String getRemediation();
  /**
   *
   *
   * <pre>
   * A description of actions that can be taken to remedy the note.
   * </pre>
   *
   * <code>string remediation = 5;</code>
   */
  com.google.protobuf.ByteString getRemediationBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this occurrence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes a security vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityOccurrence vulnerability = 8;</code>
   */
  boolean hasVulnerability();
  /**
   *
   *
   * <pre>
   * Describes a security vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityOccurrence vulnerability = 8;</code>
   */
  io.grafeas.v1.VulnerabilityOccurrence getVulnerability();
  /**
   *
   *
   * <pre>
   * Describes a security vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityOccurrence vulnerability = 8;</code>
   */
  io.grafeas.v1.VulnerabilityOccurrenceOrBuilder getVulnerabilityOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildOccurrence build = 9;</code>
   */
  boolean hasBuild();
  /**
   *
   *
   * <pre>
   * Describes a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildOccurrence build = 9;</code>
   */
  io.grafeas.v1.BuildOccurrence getBuild();
  /**
   *
   *
   * <pre>
   * Describes a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildOccurrence build = 9;</code>
   */
  io.grafeas.v1.BuildOccurrenceOrBuilder getBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes how this resource derives from the basis in the associated
   * note.
   * </pre>
   *
   * <code>.grafeas.v1.ImageOccurrence image = 10;</code>
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * Describes how this resource derives from the basis in the associated
   * note.
   * </pre>
   *
   * <code>.grafeas.v1.ImageOccurrence image = 10;</code>
   */
  io.grafeas.v1.ImageOccurrence getImage();
  /**
   *
   *
   * <pre>
   * Describes how this resource derives from the basis in the associated
   * note.
   * </pre>
   *
   * <code>.grafeas.v1.ImageOccurrence image = 10;</code>
   */
  io.grafeas.v1.ImageOccurrenceOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the installation of a package on the linked resource.
   * </pre>
   *
   * <code>.grafeas.v1.PackageOccurrence package = 11;</code>
   */
  boolean hasPackage();
  /**
   *
   *
   * <pre>
   * Describes the installation of a package on the linked resource.
   * </pre>
   *
   * <code>.grafeas.v1.PackageOccurrence package = 11;</code>
   */
  io.grafeas.v1.PackageOccurrence getPackage();
  /**
   *
   *
   * <pre>
   * Describes the installation of a package on the linked resource.
   * </pre>
   *
   * <code>.grafeas.v1.PackageOccurrence package = 11;</code>
   */
  io.grafeas.v1.PackageOccurrenceOrBuilder getPackageOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the deployment of an artifact on a runtime.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentOccurrence deployment = 12;</code>
   */
  boolean hasDeployment();
  /**
   *
   *
   * <pre>
   * Describes the deployment of an artifact on a runtime.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentOccurrence deployment = 12;</code>
   */
  io.grafeas.v1.DeploymentOccurrence getDeployment();
  /**
   *
   *
   * <pre>
   * Describes the deployment of an artifact on a runtime.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentOccurrence deployment = 12;</code>
   */
  io.grafeas.v1.DeploymentOccurrenceOrBuilder getDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes when a resource was discovered.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryOccurrence discovery = 13;</code>
   */
  boolean hasDiscovery();
  /**
   *
   *
   * <pre>
   * Describes when a resource was discovered.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryOccurrence discovery = 13;</code>
   */
  io.grafeas.v1.DiscoveryOccurrence getDiscovery();
  /**
   *
   *
   * <pre>
   * Describes when a resource was discovered.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryOccurrence discovery = 13;</code>
   */
  io.grafeas.v1.DiscoveryOccurrenceOrBuilder getDiscoveryOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes an attestation of an artifact.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationOccurrence attestation = 14;</code>
   */
  boolean hasAttestation();
  /**
   *
   *
   * <pre>
   * Describes an attestation of an artifact.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationOccurrence attestation = 14;</code>
   */
  io.grafeas.v1.AttestationOccurrence getAttestation();
  /**
   *
   *
   * <pre>
   * Describes an attestation of an artifact.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationOccurrence attestation = 14;</code>
   */
  io.grafeas.v1.AttestationOccurrenceOrBuilder getAttestationOrBuilder();

  public io.grafeas.v1.Occurrence.DetailsCase getDetailsCase();
}
