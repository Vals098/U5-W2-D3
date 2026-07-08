package valeriafarinosi.U5_W2_D3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import valeriafarinosi.U5_W2_D3.entities.BlogPost;

@Repository
public interface PostRepository extends JpaRepository<BlogPost, Integer> {
}
