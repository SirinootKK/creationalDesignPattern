package creational;

public class CSVBookMatadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter make() {
        try {
            return new CSVBookMetadataFormatter();
        } catch (Exception e) {
            return null;
        }
    }
}
