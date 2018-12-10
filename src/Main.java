import org.jitsi.impl.neomedia.jmfext.media.protocol.directshow.*;
public class Main {


    public static void main(String[] args)
    {
        // пути где лежат jn*.dll
        // String libpath = System.getProperty("java.library.path");
        DSManager dsm=new DSManager();
        DSCaptureDevice[] dev=dsm.getCaptureDevices();
        String name=dev[0].getName();
        DSFormat[] ff=dev[0].getSupportedFormats();
        int c=DSFormat.RGB24;
        c=  DSFormat.RGB32;
        c=  DSFormat.ARGB32;
        c=  DSFormat.YUY2;
        c=  DSFormat.MJPG;
        c=  DSFormat.UYVY;
        c=  DSFormat.Y411;
        c=  DSFormat.Y41P;
        c=  DSFormat.NV12;
        c=  DSFormat.I420;


        System.out.println("DEV="+dev.length);

    }
}
