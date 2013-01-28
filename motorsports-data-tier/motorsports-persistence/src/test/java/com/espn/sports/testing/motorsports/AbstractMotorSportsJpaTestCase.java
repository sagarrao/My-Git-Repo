package com.espn.sports.testing.motorsports;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.espn.sports.persistence.CompetitorType;
import com.espn.sports.persistence.Season;
import com.espn.sports.persistence.jpa.CompetitionStatusEntity;
import com.espn.sports.persistence.jpa.CompetitorEntity;
import com.espn.sports.persistence.jpa.CompetitorTypeEntity;
import com.espn.sports.persistence.jpa.FeedSourceEntity;
import com.espn.sports.persistence.jpa.TeamEntity;
import com.espn.sports.persistence.motorsports.jpa.RacingCompetitionEntity;
import com.espn.sports.testing.jpa.CommonJpaTestCase;

public abstract class AbstractMotorSportsJpaTestCase<K,E> extends CommonJpaTestCase<K, E> {
	
	  static {
	        BASES.put(RacingCompetitionEntity.class, 500000000);
	        
	    }
	  public static Integer DEFAULT_LEAGUE_ID=100;
	  //Set Default league id to System Property
	  static { System.setProperty("espn.league.default.id", "100"); }

	  public AbstractMotorSportsJpaTestCase()
	  {
	        super();
	  }

	  public AbstractMotorSportsJpaTestCase(Class<K> keyType, Class<E> entityType)
	  {
	        super(keyType, entityType);
	  }
	  
	  protected RacingCompetitionEntity createCompetition(int competitionId,
				Season season, Date startDate, Date endDate, FeedSourceEntity source) {

		  	RacingCompetitionEntity competition = new RacingCompetitionEntity(competitionId);

			competition.setStatsSource(source);
			competition.setCompetitionSource(source);
			competition.setBoxscoreSource(source);
			competition.setLinescoreSource(source);
			competition.setRtsSource(source);
			competition.setPbpSource(source);
			competition.setType(createCompetitionType());

			competition.setSeason(season);
			competition.setStartDate(startDate);
			competition.setEndDate(endDate);
			competition.setDayOfWeek(1);
			competition.setDayOfYear(1);

	        persist(competition);
	        competition = find(RacingCompetitionEntity.class, competition.getId());

			CompetitionStatusEntity status = createCompetitionStatus(
					competition.getId(), source.getId());
			List<CompetitionStatusEntity> statuses = new ArrayList<CompetitionStatusEntity>();
			statuses.add(status);
			competition.setStatuses(statuses);

			// Create competitors, but since competitor table has FK back to
			// Competition had to create competition first then merge
			TeamEntity homeTeam = createTeam();
			TeamEntity awayTeam = createTeam();
			// Also need to create the competitor types as those are used internal
			// to the competitor entity
	        checkCompetitorTypes();

			CompetitorEntity homeComp = createCompetitor(competitionId,
	                 homeTeam.getId(), homeTeam, true);
			CompetitorEntity awayComp = createCompetitor(competitionId,
	                 awayTeam.getId(), awayTeam, false);

			competition.addCompetitor(homeComp);
	        competition.addCompetitor(awayComp);
			//merge(competition);

			return competition;
		}
	  
	  private void checkCompetitorTypes() {
			CompetitorTypeEntity type = find(CompetitorTypeEntity.class,
					Integer.valueOf(CompetitorType.PLAYER));
			if (type == null) {
				createCompetitorType(CompetitorType.PLAYER);
			}
			type = find(CompetitorTypeEntity.class,
					Integer.valueOf(CompetitorType.TEAM));
			if (type == null) {
				createCompetitorType(CompetitorType.TEAM);
			}
			type = find(CompetitorTypeEntity.class,
					Integer.valueOf(CompetitorType.TEAM_OF_PLAYERS));
			if (type == null) {
				createCompetitorType(CompetitorType.TEAM_OF_PLAYERS);
			}
		}
}
