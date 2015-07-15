/**
 * nfs-rpc
 *   Apache License
 *   
 *   http://code.google.com/p/nfs-rpc (c) 2011
 */
package info.minzhou.lightning.rpc.protocol;
/**
 * Protocol Interface,for custom network protocol
 * 
 * @author <a href="mailto:bluedavy@gmail.com">bluedavy</a>
 */
public interface Protocol {
	
	/**
	 * encode Message to byte and write to network framework
	 * 
	 * @param message
	 * @param bytebufferWrapper
	 * @throws Exception
	 */
	public ByteBufferWrapper encode(Object message, ByteBufferWrapper bytebufferWrapper) throws Exception;

	/**
	 * decode stream to object
	 * 
	 * @param wrapper
	 * @param errorObject stream not enough,then return this object
	 * @return Object 
	 * @throws Exception
	 */
	public Object decode(ByteBufferWrapper wrapper, Object errorObject,int...originPos) throws Exception;

}