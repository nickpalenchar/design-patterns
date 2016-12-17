package net.nickpalenchar;
import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {

    }
}
