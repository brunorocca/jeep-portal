package br.com.isobar.jeep.portal;

import java.io.InputStream;

/**
 * A simple service interface
 */
public interface ResourceService {
    
    /**
     * @return the name of the underlying JCR repository implementation
     */
    public String getRepositoryName();
    
    public String readFromDam(InputStream is, String fileName);

    public String writeToDam(final String fileName, final String json);
}