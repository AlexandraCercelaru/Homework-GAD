public class ArtAlbum extends Books {
    private String PaperQuality;

    public String getPaperQuality() {
        return PaperQuality;
    }

    public String getName() {
        return super.getName();
    }

    public int getNumberOfPages() {
        return super.getNumberOfPages();
    }

    @Override
    public String toString() {
        return "ArtAlbum{" + super.toString() + ", PaperQuality='" + PaperQuality + '\'' + '}';
    }

    public ArtAlbum(String name, int number, String quality) {
        super.addBook(name, number);
        this.PaperQuality = quality;
    }

}
