/**
 * Bugged project
 */

protected PreDeConModel computeLocalModel (DoubleDBIDList neightbords, ....) {
final int referenceSetSize = neightbord.size();
        ....
        //Shouldn't happend
        if (referenceSetSize < 0) {
        LOG.warning("Empty reference set -"
        "should at least include the query point!");
        return new PreDeConModel(Integer.MAX_VALUE, DBIDUtil.EMPTYDBIDS);
        }
        ....
        for(int d = 0; d < dim; d++) {
        s[d] /= referenceSetSize;
        mvVar.put(s[d]);
        }
        ....
        }

/**
 * Debuged
 */

protected PreDeConModel computeLocalModel (DoubleDBIDList neightbords, ....) {
final int referenceSetSize = neightbord.size();
        //Shouldn't happend
        if (referenceSetSize < 0) {
        logger.warning("Empty reference set - should at least include the query point!");
        return new PreDeConModel(Integer.MAX_VALUE, DBIDUtil.EMPTYDBIDS);
        }
        int[] s;
        for(int d = 0; d < dim; d++) {
        s[d] /= referenceSetSize;
        mvVar.put(s[d]);
        }
        return new PreDeConModel(referenceSetSize, s[d])
        }