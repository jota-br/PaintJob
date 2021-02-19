public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {

            double neededBuckets = ((width * height) / areaPerBucket) - extraBuckets;
            return (int) Math.ceil(neededBuckets);
        }

        return -1;
    }

    public static int getBucketCount(double height, double width, double areaPerBucket) {

        if(width > 0 && height > 0 && areaPerBucket > 0) {

            double neededBuckets = ((width * height) / areaPerBucket);
            return (int) Math.ceil(neededBuckets);
        }

        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area > 0 && areaPerBucket > 0) {

            double neededBuckets = area / areaPerBucket;
            return (int) Math.ceil(neededBuckets);
        }

        return -1;
    }

}