db.employees.find().sort({_id: -1}).limit(5)
db.workers.updateMany(
    {$firstname: {$in: ['Boris', 'Marina']}}, 
    {$push: 
        {skills: 
            {$each: ['working with CRM-system', 'preparing for a concert']}
        }
    }
    )
    db.workers.updateMany(
        
    )