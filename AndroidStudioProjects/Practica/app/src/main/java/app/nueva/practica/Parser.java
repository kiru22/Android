package app.nueva.practica;

import android.content.pm.PackageManager;
import android.widget.EditText;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by kiru on 28/02/2017.
 */

public class Parser {


    try{


        ArrayList<Pregunta> items = new ArrayList<Pregunta>();
        XmlPullParser xpp = getResources().getXml(R.xml.questions);
        while (xpp.getEventType() != XmlPullParser.END_DOCUMENT){
            if (xpp.getEventType() == XmlPullParser.START_TAG){
                if (xpp.getName().equals("question")){
                        Pregunta pregunta = new Pregunta(
                                xpp.getAttributeValue(0),
                                xpp.getAttributeValue(1),
                                xpp.getAttributeValue(2),
                                xpp.getAttributeValue(3),
                                xpp.getAttributeValue(4),
                                xpp.getAttributeValue(5),
                                xpp.getAttributeValue(6),
                                xpp.getAttributeValue(7),
                                xpp.getAttributeValue(8),
                                xpp.getAttributeValue(9),
                                xpp.getAttributeValue(10));

                    items.add(pregunta);
                    }

                }
            }

            xpp.next();

        }
    catch (XmlPullParserException e) {e.printStackTrace();}
    catch (FileNotFoundException e){e.printStackTrace();}
    catch (IOException e){e.printStackTrace();}

}



/**
    try {

   XmlPullParser fis = getResources().getXml(R.xml.questions);
        InputStreamReader reader = new InputStreamReader(fis);
        XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
        parser.setInput(reader);

        int eventType = parser.getEventType();
        EditText target = null;

        while (XmlPullParser.END_DOCUMENT != eventType) {
            switch (eventType) {
                case XmlPullParser.START_TAG:
                    if ("From".equals(parser.getName())) {
                        tvFrom.setText(String.format(getResources().getString(R.string.from), parser.getAttributeValue(null, "Name")));
                        target = etFrom;
                    } else if ("To".equals(parser.getName())) {
                        tvTo.setText(String.format(getResources().getString(R.string.to), parser.getAttributeValue(null, "Name")));
                        target = etTo;
                    } else if ("Subject".equals(parser.getName())) {
                        target = etSubject;
                    } else if ("Body".equals(parser.getName())) {
                        target = etBody;
                    }
                    break;
                case XmlPullParser.TEXT:
                    target.setText(parser.getText());
                    break;
            }
            parser.next();
            eventType = parser.getEventType();
        }   reader.close();
    }
    catch (XmlPullParserException e) {e.printStackTrace();}
    catch (FileNotFoundException e){e.printStackTrace();}
    catch (IOException e){e.printStackTrace();}

 **/

