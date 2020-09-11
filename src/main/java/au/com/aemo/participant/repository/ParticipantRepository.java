package au.com.aemo.participant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.com.aemo.participant.model.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long>{

}
