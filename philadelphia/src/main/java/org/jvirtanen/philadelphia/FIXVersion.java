package org.jvirtanen.philadelphia;

/**
 * The protocol version.
 */
public enum FIXVersion {

    FIX_4_2("FIX.4.2"),
    FIX_4_4("FIX.4.4");

    private String beginString;

    private FIXVersion(String beginString) {
        this.beginString = beginString;
    }

    /**
     * Get the BeginString(8).
     *
     * @return the BeginString(8)
     */
    public String getBeginString() {
        return beginString;
    }

}
