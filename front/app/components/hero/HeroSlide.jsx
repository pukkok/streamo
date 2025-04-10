'use client'

import HeroContent from './HeroContent'

const HeroSlide = ({ id, title, description, color, age, views, runtime, genre }) => {
  return (
    <div
      className="relative w-full h-full"
      style={{ backgroundColor: color }}
    >
      <HeroContent
        title={title}
        description={description}
        age={age}
        views={views}
        runtime={runtime}
        genre={genre}
      />
    </div>
  )
}

export default HeroSlide
