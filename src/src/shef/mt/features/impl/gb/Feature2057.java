/**
 *
 */
package shef.mt.features.impl.gb;

import shef.mt.features.util.Sentence;
import java.util.HashSet;

import shef.mt.features.impl.Feature;

/**
 * CMU: percentage of discarded graph nodes
 *
 * @author cat
 *
 */
public class Feature2057 extends Feature {

    public Feature2057() {
        setIndex("2057");
        HashSet<String> res = new HashSet<String>();
        res.add("discarded");
        setDescription("CMU: percentage of discarded graph nodes");
        setResources(res);

    }

    public void run(Sentence source, Sentence target) {
        float total = new Float((String) source.getValue("totalHypotheses"));
        float disc = new Float((String) source.getValue("discarded"));
        setValue(disc / total);

    }
}
