// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/graph_transfer_info.proto

package org.tensorflow.framework;

public interface GraphTransferNodeOutputInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphTransferNodeOutputInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 node_id = 1;</code>
   */
  int getNodeId();

  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   */
  java.util.List<java.lang.Integer> getMaxByteSizeList();
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   */
  int getMaxByteSizeCount();
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   */
  int getMaxByteSize(int index);
}