import classDomain.Channel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import java.io.File;
import java.util.List;


/**
 * Created by kenshoo-linux on 24/07/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class ChannelCSVReaderTest {

    private ChannelCSVReader classUnderTest;
    public static final Channel CHANNEL_STUB = new Channel();
    public static final Channel CHANNEL_STUB_1 = new Channel();
    public static final Channel CHANNEL_STUB_2 = new Channel();
    public static final Channel CHANNEL_STUB_3 = new Channel();

    @Mock
    private Converter convertorMock;
    @Mock
    private ChannelCSVReader channelCSVReaderMock;

    @Before
    public void setup() {
        this.classUnderTest = new ChannelCSVReader(this.convertorMock);

    }

//    @Test
//    public void shouldReadASingleLineAndReturnAChannel() {
//        Mockito.when(this.convertorMock.returnLineAsChannel("Google,2831944540,186307692,,,,GOOGLE_WOMENS_ACCESSORIES_PLA,WOMENS ACCESSORIES,GOOGLE,PLA,CENTER CORE,,,WOMENS ACCESSORIES,BRANDS,BRANDS,",","))
//                .thenReturn(CHANNEL_STUB);
//        String testPath = "/home/ken-linux2/develop/projects/Java Project/test/data/shouldReadASingleLineAndReturnAChannel.csv";
//        List channels = this.classUnderTest.read(testPath);
//        Assert.assertNotNull(channels);
//        Assert.assertEquals(1L, (long)channels.size());
//        Assert.assertSame(CHANNEL_STUB, channels.get(0));
//    }

    @Test
    public void shouldCheckIfFileIsEmpty() {
        String testPath = "/home/ken-linux2/develop/projects/Java Project/test/data/shouldCheckIfFileIsEmpty.csv";
        new File(testPath);
        List channels = this.classUnderTest.read(testPath);
        Assert.assertNotNull(channels);
        Assert.assertTrue(channels.isEmpty());
    }
//
//
//    public void shouldCheckIfCanReadMultipleLines() {
//        String testPath = "/home/ken-linux2/develop/projects/Java Project/test/data/shouldCheckIfCanReadMultipleLines.csv";
//        Mockito.when(this.convertorMock.returnLineAsChannel("Google,2831944540,281189052,,,,GOOGLE_WOMENS_ACCESSORIES_PLA,WOMENS ACCESSORIES,GOOGLE,PLA,CENTER CORE,GENERIC,,WOMENS ACCESSORIES,,,",",")).thenReturn(CHANNEL_STUB_1);
//        Mockito.when(this.convertorMock.returnLineAsChannel("Google,2831944540,281204052,,,,GOOGLE_WOMENS_ACCESSORIES_PLA,WOMENS ACCESSORIES,GOOGLE,PLA,CENTER CORE,GENERIC,,WOMENS ACCESSORIES,,,",",")).thenReturn(CHANNEL_STUB_2);
//        Mockito.when(this.convertorMock.returnLineAsChannel("Google,2831944540,281194212,,,,GOOGLE_WOMENS_ACCESSORIES_PLA,WOMENS ACCESSORIES,GOOGLE,PLA,CENTER CORE,GENERIC,,WOMENS ACCESSORIES,,,",",")).thenReturn(CHANNEL_STUB_3);
//        List channels = this.classUnderTest.read(testPath);
//        Assert.assertNotNull(channels);
//        Assert.assertEquals(3L, (long)channels.size());
//        Assert.assertSame(CHANNEL_STUB_1, channels.get(0));
//        Assert.assertSame(CHANNEL_STUB_2, channels.get(1));
//        Assert.assertSame(CHANNEL_STUB_3, channels.get(2));
//    }
}

