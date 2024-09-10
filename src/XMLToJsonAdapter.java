interface JsonParser {
    void parseJson(String json);
}

class LegacyXmlParser {
    public void parseXml(String xml) {
        System.out.println("Parsing XML: " + xml);
    }
}

class XmlToJsonAdapter implements JsonParser {
    private LegacyXmlParser legacyXmlParser;

    public XmlToJsonAdapter(LegacyXmlParser legacyXmlParser) {
        this.legacyXmlParser = legacyXmlParser;
    }

    @Override
    public void parseJson(String json) {
        // Convert JSON to XML and then parse it using the legacy XML parser
        String xml = convertJsonToXml(json);
        legacyXmlParser.parseXml(xml);
    }

    private String convertJsonToXml(String json) {
        // Simple conversion logic (mock)
        return "<xml>" + json + "</xml>";
    }
}
