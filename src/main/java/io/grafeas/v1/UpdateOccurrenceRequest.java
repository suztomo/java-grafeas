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

/**
 *
 *
 * <pre>
 * Request to update an occurrence.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.UpdateOccurrenceRequest}
 */
public final class UpdateOccurrenceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.UpdateOccurrenceRequest)
    UpdateOccurrenceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateOccurrenceRequest.newBuilder() to construct.
  private UpdateOccurrenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateOccurrenceRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateOccurrenceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateOccurrenceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              io.grafeas.v1.Occurrence.Builder subBuilder = null;
              if (occurrence_ != null) {
                subBuilder = occurrence_.toBuilder();
              }
              occurrence_ = input.readMessage(io.grafeas.v1.Occurrence.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(occurrence_);
                occurrence_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.GrafeasOuterClass
        .internal_static_grafeas_v1_UpdateOccurrenceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.GrafeasOuterClass
        .internal_static_grafeas_v1_UpdateOccurrenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.UpdateOccurrenceRequest.class,
            io.grafeas.v1.UpdateOccurrenceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OCCURRENCE_FIELD_NUMBER = 2;
  private io.grafeas.v1.Occurrence occurrence_;
  /**
   *
   *
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the occurrence field is set.
   */
  public boolean hasOccurrence() {
    return occurrence_ != null;
  }
  /**
   *
   *
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The occurrence.
   */
  public io.grafeas.v1.Occurrence getOccurrence() {
    return occurrence_ == null ? io.grafeas.v1.Occurrence.getDefaultInstance() : occurrence_;
  }
  /**
   *
   *
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public io.grafeas.v1.OccurrenceOrBuilder getOccurrenceOrBuilder() {
    return getOccurrence();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (occurrence_ != null) {
      output.writeMessage(2, getOccurrence());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (occurrence_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOccurrence());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1.UpdateOccurrenceRequest)) {
      return super.equals(obj);
    }
    io.grafeas.v1.UpdateOccurrenceRequest other = (io.grafeas.v1.UpdateOccurrenceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasOccurrence() != other.hasOccurrence()) return false;
    if (hasOccurrence()) {
      if (!getOccurrence().equals(other.getOccurrence())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasOccurrence()) {
      hash = (37 * hash) + OCCURRENCE_FIELD_NUMBER;
      hash = (53 * hash) + getOccurrence().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.grafeas.v1.UpdateOccurrenceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to update an occurrence.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.UpdateOccurrenceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.UpdateOccurrenceRequest)
      io.grafeas.v1.UpdateOccurrenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_UpdateOccurrenceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_UpdateOccurrenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.UpdateOccurrenceRequest.class,
              io.grafeas.v1.UpdateOccurrenceRequest.Builder.class);
    }

    // Construct using io.grafeas.v1.UpdateOccurrenceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (occurrenceBuilder_ == null) {
        occurrence_ = null;
      } else {
        occurrence_ = null;
        occurrenceBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_UpdateOccurrenceRequest_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.UpdateOccurrenceRequest getDefaultInstanceForType() {
      return io.grafeas.v1.UpdateOccurrenceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.UpdateOccurrenceRequest build() {
      io.grafeas.v1.UpdateOccurrenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.UpdateOccurrenceRequest buildPartial() {
      io.grafeas.v1.UpdateOccurrenceRequest result =
          new io.grafeas.v1.UpdateOccurrenceRequest(this);
      result.name_ = name_;
      if (occurrenceBuilder_ == null) {
        result.occurrence_ = occurrence_;
      } else {
        result.occurrence_ = occurrenceBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1.UpdateOccurrenceRequest) {
        return mergeFrom((io.grafeas.v1.UpdateOccurrenceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.UpdateOccurrenceRequest other) {
      if (other == io.grafeas.v1.UpdateOccurrenceRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasOccurrence()) {
        mergeOccurrence(other.getOccurrence());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grafeas.v1.UpdateOccurrenceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1.UpdateOccurrenceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private io.grafeas.v1.Occurrence occurrence_;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Occurrence,
            io.grafeas.v1.Occurrence.Builder,
            io.grafeas.v1.OccurrenceOrBuilder>
        occurrenceBuilder_;
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the occurrence field is set.
     */
    public boolean hasOccurrence() {
      return occurrenceBuilder_ != null || occurrence_ != null;
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The occurrence.
     */
    public io.grafeas.v1.Occurrence getOccurrence() {
      if (occurrenceBuilder_ == null) {
        return occurrence_ == null ? io.grafeas.v1.Occurrence.getDefaultInstance() : occurrence_;
      } else {
        return occurrenceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOccurrence(io.grafeas.v1.Occurrence value) {
      if (occurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        occurrence_ = value;
        onChanged();
      } else {
        occurrenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOccurrence(io.grafeas.v1.Occurrence.Builder builderForValue) {
      if (occurrenceBuilder_ == null) {
        occurrence_ = builderForValue.build();
        onChanged();
      } else {
        occurrenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeOccurrence(io.grafeas.v1.Occurrence value) {
      if (occurrenceBuilder_ == null) {
        if (occurrence_ != null) {
          occurrence_ =
              io.grafeas.v1.Occurrence.newBuilder(occurrence_).mergeFrom(value).buildPartial();
        } else {
          occurrence_ = value;
        }
        onChanged();
      } else {
        occurrenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearOccurrence() {
      if (occurrenceBuilder_ == null) {
        occurrence_ = null;
        onChanged();
      } else {
        occurrence_ = null;
        occurrenceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public io.grafeas.v1.Occurrence.Builder getOccurrenceBuilder() {

      onChanged();
      return getOccurrenceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public io.grafeas.v1.OccurrenceOrBuilder getOccurrenceOrBuilder() {
      if (occurrenceBuilder_ != null) {
        return occurrenceBuilder_.getMessageOrBuilder();
      } else {
        return occurrence_ == null ? io.grafeas.v1.Occurrence.getDefaultInstance() : occurrence_;
      }
    }
    /**
     *
     *
     * <pre>
     * The updated occurrence.
     * </pre>
     *
     * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Occurrence,
            io.grafeas.v1.Occurrence.Builder,
            io.grafeas.v1.OccurrenceOrBuilder>
        getOccurrenceFieldBuilder() {
      if (occurrenceBuilder_ == null) {
        occurrenceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1.Occurrence,
                io.grafeas.v1.Occurrence.Builder,
                io.grafeas.v1.OccurrenceOrBuilder>(
                getOccurrence(), getParentForChildren(), isClean());
        occurrence_ = null;
      }
      return occurrenceBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1.UpdateOccurrenceRequest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.UpdateOccurrenceRequest)
  private static final io.grafeas.v1.UpdateOccurrenceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.UpdateOccurrenceRequest();
  }

  public static io.grafeas.v1.UpdateOccurrenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOccurrenceRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateOccurrenceRequest>() {
        @java.lang.Override
        public UpdateOccurrenceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateOccurrenceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateOccurrenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOccurrenceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.UpdateOccurrenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
