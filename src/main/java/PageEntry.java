public class PageEntry implements Comparable<PageEntry> {
    private final String pdfName;
    private final int page;
    private final int count;

    PageEntry(String pdfName, int page, int count) {
        this.pdfName = pdfName;
        this.page = page;
        this.count = count;
    }


    @Override
    /*
//    PageEntry { pdf = Этапы оценки проекта_ понятия, методы и полезные инструменты.pdf, page=12, count=6 },
    */
    public String toString() {
        return "PageEntry { pdf = " + pdfName
                + ", page = " + page
                + ", count = " + count
                + " }, \n";
    }

    @Override
    /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    public int compareTo(PageEntry o) {
        return 0;
    }
}
