'use client'

import HeroContent from './HeroContent'
import Container from '../Container'

const HeroSlide = ({ id, title, description, color, age, views, runtime, genre }) => {
  return (
    <div
      className="w-full h-full"
      style={{ backgroundColor: color }}
    >
      <Container className='relative h-full'>
        <HeroContent
          title={title}
          description={description}
          age={age}
          views={views}
          runtime={runtime}
          genre={genre}
        />
      </Container>
    </div>
  )
}

export default HeroSlide
