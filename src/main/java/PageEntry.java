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
                + " }";
    }

    @Override
    public int compareTo(PageEntry o) {
        int result = o.count - this.count;
        if (result == 0) {
            result = this.pdfName.compareTo(o.pdfName);
            if (result == 0) {
                result = this.page - o.page;
            }
        }
        return result;
    }
}
