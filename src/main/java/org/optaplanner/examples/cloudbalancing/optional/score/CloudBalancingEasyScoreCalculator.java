package org.optaplanner.examples.cloudbalancing.optional.score;

import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;
import org.optaplanner.examples.cloudbalancing.domain.CloudBalance;

/**
 * CloudBalancingEasyScoreCalculator
 */
public class CloudBalancingEasyScoreCalculator implements EasyScoreCalculator<CloudBalance> {

    @Override
    public HardSoftScore calculateScore(CloudBalance solution) {
        int hardScore = 0;
        int softScore = 0;
        
        return HardSoftScore.of(hardScore, softScore);
    }

    
}