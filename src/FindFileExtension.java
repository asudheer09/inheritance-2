public class FindFileExtension {

    public static final long MAX_FILE_SIZE=5120;
    public static boolean  isExcelFile(String extension){
        if("xlsx".equals(extension) || "xls".equals(extension)){
            return  true;
        }else{
            return false;
        }
    }

    public void checkFileSize(long fileSize){
        if(fileSize>MAX_FILE_SIZE){
            System.out.println("file size is exceeded");
        }else {
            System.out.println("file size is valid");
        }
    }


    public static void main(String[] args) {
        String fileExtension="doc";
      boolean isExcel= isExcelFile(fileExtension);

        System.out.println("is given file excel ? "+ isExcel);
        FindFileExtension ffe= new FindFileExtension();
        ffe.checkFileSize(6000);
        ffe.checkFileSize(4000);

    }
}
