'use client'

import Container from "../Container"

const CategorySection = ({ title, items }) => {
  return (
    <section className="mt-12">
      <Container>
        <h2 className="text-xl font-bold mb-4">{title}</h2>
        <div className="flex gap-4 overflow-x-auto">
          {items.map((item) => (
            <div key={item.id} className="w-[200px] shrink-0">
              <div
                className="aspect-[2/3] rounded-lg mb-2"
                style={{ backgroundColor: item.color }}
              />
              <h3 className="text-sm font-semibold truncate">{item.title}</h3>
              <p className="text-xs text-gray-400">
                {item.year} ・ {item.runtime}
              </p>
            </div>
          ))}
        </div>
      </Container>
    </section>
  )
}

export default CategorySection
