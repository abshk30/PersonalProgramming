package com.array.convertor;

import java.nio.ByteBuffer;

public class ByteToLoneConvertor {

	    private static ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);    

	    public static long bytesToLong(byte[] bytes) {
	        buffer.put(bytes, 0, bytes.length);
	        buffer.flip();
	        return buffer.getLong();
	    }
}
